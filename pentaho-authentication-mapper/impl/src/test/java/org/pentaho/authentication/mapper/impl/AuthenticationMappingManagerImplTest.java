/*! ******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2002-2016 by Pentaho : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.authentication.mapper.impl;

import com.google.common.collect.ImmutableMap;
import com.google.common.io.ByteStreams;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.pentaho.authentication.mapper.api.AuthenticationMappingManager;
import org.pentaho.authentication.mapper.api.AuthenticationMappingService;
import org.pentaho.authentication.mapper.api.MappingException;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * @author nhudak
 */

//@RunWith( org.mockito.runners.MockitoJUnitRunner.class )
public class AuthenticationMappingManagerImplTest {
/*
  @Rule public TemporaryFolder etc = new TemporaryFolder();
  @Rule public ExpectedException exception = ExpectedException.none();
  @Captor ArgumentCaptor<Map<String, Object>> mapArgumentCaptor;
  private AuthenticationMappingManagerImpl manager;
  private File configuration;

  @Before
  public void setUp() throws Exception {
    System.setProperty( "karaf.etc", etc.getRoot().getAbsolutePath() );

    configuration = etc.newFile( AuthenticationMappingManager.CONFIG_FILE_NAME );
    ByteStreams.copy( getClass().getResourceAsStream( "/mapping.json" ), new FileOutputStream( configuration ) );

    manager = new AuthenticationMappingManagerImpl();
  }

  @Test
  @SuppressWarnings( "unchecked" )
  public void mappingService() throws Exception {
    // Add mock service
    TestService service = new TestService( "cluster_security_mapping_configuration" );
    manager.onMappingServiceAdded( service, ImmutableMap.of( AuthenticationMappingManager.RANKING_CONFIG, 200 ) );

    // Also add decoy services with lower (default) priority an invalid input
    TestService defaultService = new TestService( "default" );
    manager.onMappingServiceAdded( defaultService, ImmutableMap.of() );
    TestService unused = new TestService( "unused" ) {
      @Override public boolean accepts( Object input ) {
        return false;
      }
    };
    manager.onMappingServiceAdded( unused, ImmutableMap.of( AuthenticationMappingManager.RANKING_CONFIG, 1000 ) );

    // Service called if input/output match
    Map<String, ?> result = manager.getMapping( String.class, "map this", Map.class );

    assertThat( result, allOf(
      hasEntry( "id", "cluster_security_mapping_configuration" ),
      hasEntry( "input", "map this" ),
      hasEntry( is( "config" ), instanceOf( Map.class ) ) )
    );
    assertThat( (Map<String, ?>) result.get( "config" ), hasKey( "default" ) );

    // Remove service, default will be used
    manager.onMappingServiceRemoved( service );
    result = manager.getMapping( String.class, "use the default", Map.class );
    assertThat( result, hasEntry( "id", "default" ) );
  }

  @Test
  public void expectMappingExceptionOnConfigError() throws Exception {
    manager.onMappingServiceAdded( new TestService( "default" ), ImmutableMap.of() );
    manager.getMapping( String.class, "some value", Map.class );

    assertThat( configuration.delete(), is( true ) );
    configuration = etc.newFile( AuthenticationMappingManager.CONFIG_FILE_NAME );
    ByteStreams.copy( getClass().getResourceAsStream( "/invalid_mapping.json" ),
      new FileOutputStream( configuration ) );

    exception.expect( MappingException.class );
    manager.getMapping( String.class, "some value", Map.class );
  }

  @Test
  public void expectEmptyConfigWhenConfigFileNotPresent() throws Exception {
    manager.onMappingServiceAdded( new TestService( "default" ), ImmutableMap.of() );
    manager.getMapping( String.class, "some value", Map.class );

    assertThat( configuration.delete(), is( true ) );
    assertThat( ( (Map) manager.getMapping( String.class, "some value", Map.class ).get( "config" ) ).size(),
      is( 0 ) );
  }

  @Test
  public void noMappingAvailable() throws Exception {
    assertThat( manager.getMapping( String.class, "some value", List.class ), nullValue() );
  }

  class TestService implements AuthenticationMappingService<String, Map> {

    final String id;

    TestService( String id ) {
      this.id = id;
    }

    @Override public String getId() {
      return id;
    }

    @Override public Class<String> getInputType() {
      return String.class;
    }

    @Override public Class<Map> getOutputType() {
      return Map.class;
    }

    @Override public boolean accepts( Object input ) {
      return true;
    }

    @Override public Map getMapping( String input, Map<String, ?> config ) throws MappingException {
      return ImmutableMap.of( "id", id, "input", input, "config", config );
    }
  }*/
}
