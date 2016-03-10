
/**namespace:Indices.IndexManagement.DeleteIndex */
interface DeleteIndexRequest extends Request {
	/**ambiguous_origin*/
	Timeout: Time;
	/**ambiguous_origin*/
	MasterTimeout: Time;
	/**ambiguous_origin*/
	Source: string;
	/**ambiguous_origin*/
	FilterPath: string;
}