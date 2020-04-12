
package org.elasticsearch.x_pack.security.api_key.get_api_key;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


public class GetApiKeyRequest  implements XContentable<GetApiKeyRequest> {
  
  static final ParseField ID = new ParseField("id");
  private String _id;
  public String getId() { return this._id; }
  public GetApiKeyRequest setId(String val) { this._id = val; return this; }


  static final ParseField NAME = new ParseField("name");
  private String _name;
  public String getName() { return this._name; }
  public GetApiKeyRequest setName(String val) { this._name = val; return this; }


  static final ParseField REALM_NAME = new ParseField("realm_name");
  private String _realmName;
  public String getRealmName() { return this._realmName; }
  public GetApiKeyRequest setRealmName(String val) { this._realmName = val; return this; }


  static final ParseField USERNAME = new ParseField("username");
  private String _username;
  public String getUsername() { return this._username; }
  public GetApiKeyRequest setUsername(String val) { this._username = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.field(ID.getPreferredName(), _id);
    builder.field(NAME.getPreferredName(), _name);
    builder.field(REALM_NAME.getPreferredName(), _realmName);
    builder.field(USERNAME.getPreferredName(), _username);
    return builder;
  }

  @Override
  public GetApiKeyRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetApiKeyRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetApiKeyRequest, Void> PARSER =
    new ConstructingObjectParser<>(GetApiKeyRequest.class.getName(), false, args -> new GetApiKeyRequest());

  static {
    PARSER.declareString(GetApiKeyRequest::setId, ID);
    PARSER.declareString(GetApiKeyRequest::setName, NAME);
    PARSER.declareString(GetApiKeyRequest::setRealmName, REALM_NAME);
    PARSER.declareString(GetApiKeyRequest::setUsername, USERNAME);
  }

}
