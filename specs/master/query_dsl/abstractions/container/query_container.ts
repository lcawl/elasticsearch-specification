
/**namespace:QueryDsl.Abstractions.Container */
/**custom_serialization*/
interface QueryContainer {
	IsConditionless: boolean;
	IsStrict: boolean;
	IsVerbatim: boolean;
	RawQuery: RawQuery;
	bool: BoolQuery;
	match_all: MatchAllQuery;
	term: TermQuery;
	wildcard: WildcardQuery;
	prefix: PrefixQuery;
	boosting: BoostingQuery;
	ids: IdsQuery;
	limit: LimitQuery;
	constant_score: ConstantScoreQuery;
	dis_max: DisMaxQuery;
	multi_match: MultiMatchQuery;
	match: MatchQuery;
	fuzzy: FuzzyQuery;
	geo_shape: GeoShapeQuery;
	common: CommonTermsQuery;
	terms: TermsQuery;
	range: RangeQuery;
	regexp: RegexpQuery;
	has_child: HasChildQuery;
	has_parent: HasParentQuery;
	span_term: SpanTermQuery;
	simple_query_string: SimpleQueryStringQuery;
	query_string: QueryStringQuery;
	mlt: MoreLikeThisQuery;
	span_first: SpanFirstQuery;
	span_or: SpanOrQuery;
	span_near: SpanNearQuery;
	span_not: SpanNotQuery;
	span_containing: SpanContainingQuery;
	span_within: SpanWithinQuery;
	span_multi: SpanMultiTermQuery;
	nested: NestedQuery;
	indices: IndicesQuery;
	function_score: FunctionScoreQuery;
	template: TemplateQuery;
	geo_bounding_box: GeoBoundingBoxQuery;
	geo_distance: GeoDistanceQuery;
	geo_polygon: GeoPolygonQuery;
	geo_distance_range: GeoDistanceRangeQuery;
	geohash_cell: GeoHashCellQuery;
	script: ScriptQuery;
	exists: ExistsQuery;
	missing: MissingQuery;
	type: TypeQuery;
	filtered: FilteredQuery;
	and: AndQuery;
	or: OrQuery;
	not: NotQuery;
}