(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-detail-detail"],{2950:function(t,e,i){"use strict";var a=i("ee27");Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0,i("96cf");var n=a(i("c964")),s=a(i("7312")),o={components:{share:s.default},data:function(){return{loaded:!1,currentEpd:1,data:{guessList:[{},{},{},{}]},shareList:[]}},onLoad:function(){var t=this;return(0,n.default)(regeneratorRuntime.mark((function e(){var i,a;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,t.$api.json("detailData");case 2:return i=e.sent,e.next=5,t.$api.json("shareList");case 5:a=e.sent,t.loaded=!0,t.data=i,t.shareList=a,uni.setNavigationBarTitle({title:i.title});case 10:case"end":return e.stop()}}),e)})))()},methods:{imageOnLoad:function(t,e){this.$set(this.data[t][e],"loaded","loaded")},changeEpd:function(t){var e=this.data.episodeList,i=e[t];this.$api.msg("切换到第".concat(i,"项")),this.currentEpd=i},share:function(){this.$refs.share.toggleMask()},favorite:function(){this.data.favorite=!this.data.favorite}},onBackPress:function(){if(this.$refs.share.show)return this.$refs.share.toggleMask(),!0}};e.default=o},4922:function(t,e,i){var a=i("24fb");e=a(!1),e.push([t.i,'@charset "UTF-8";\n/* 页面左右间距 */\n/* 文字尺寸 */\n/*文字颜色*/\n/* 边框颜色 */\n/* 图片加载中颜色 */\n/* 行为相关颜色 */uni-page-body[data-v-a9842764]{background:#f8f8f8}.carousel[data-v-a9842764]{height:200px}.carousel .image-wrapper[data-v-a9842764]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;-webkit-align-content:center;align-content:center;width:100%;height:100%;overflow:hidden}.carousel .image-wrapper uni-image[data-v-a9842764]{width:100%;height:100%}.scroll-view-wrapper[data-v-a9842764]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;height:%?90?%;padding:%?20?% 0 %?20?% %?40?%;background:#fff}.episode-panel[data-v-a9842764]{white-space:nowrap;width:100%}.episode-panel uni-view[data-v-a9842764]{display:inline-block;margin-right:%?30?%;width:%?56?%;font-size:%?32?%;color:#606266}.episode-panel uni-view.current[data-v-a9842764]{color:#07a7a7}.info[data-v-a9842764]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;padding:%?10?% %?40?%;background:#fff}.info .title[data-v-a9842764]{-webkit-box-flex:1;-webkit-flex:1;flex:1;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;font-size:%?36?%;color:#303133}.info .title uni-text[data-v-a9842764]:last-child{font-size:%?24?%;color:#909399;margin-top:%?4?%}.info .title uni-text:last-child.Skeleton[data-v-a9842764]{width:%?220?%}.info .yticon[data-v-a9842764]{font-size:%?44?%;color:#606266;margin:0 %?10?% 0 %?30?%}.actions[data-v-a9842764]{padding:%?10?% %?28?%;background:#fff}.actions .yticon[data-v-a9842764]{font-size:%?46?%;color:#606266;padding:%?10?% %?12?%}.actions .yticon.active[data-v-a9842764]{color:#ff4443}.actions .yticon[data-v-a9842764]:nth-child(2){font-size:%?50?%}.section-tit[data-v-a9842764]{font-size:%?30?%;color:#303133;margin-bottom:%?30?%;text-align:center}.guess[data-v-a9842764]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;-webkit-box-align:center;-webkit-align-items:center;align-items:center;padding:%?30?% %?40?% %?10?%;margin-top:%?16?%;background:#fff}.guess-list[data-v-a9842764]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-flex-wrap:wrap;flex-wrap:wrap;width:100%}.guess-item[data-v-a9842764]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;-webkit-box-flex:1;-webkit-flex:1;flex:1;overflow:hidden;min-width:40%;margin-right:%?26?%;padding-bottom:%?40?%}.guess-item[data-v-a9842764]:nth-child(2n){margin-right:0}.guess-item uni-image[data-v-a9842764]{width:100%;height:%?200?%;border-radius:%?10?%}.guess-item uni-text[data-v-a9842764]{font-size:%?24?%;color:#909399}.guess-item uni-text.Skeleton[data-v-a9842764]{width:%?180?%}.guess-item uni-text.Skeleton.title[data-v-a9842764]{width:%?140?%}.guess-item uni-text.title[data-v-a9842764]{font-size:%?30?%;color:#303133;margin-top:%?16?%;margin-bottom:%?8?%}.evalution[data-v-a9842764]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;background:#fff;margin-top:%?16?%;padding:%?40?% 0}.eva-item[data-v-a9842764]{display:-webkit-box;display:-webkit-flex;display:flex;padding:%?20?% %?40?%}.eva-item uni-image[data-v-a9842764]{width:%?60?%;height:%?60?%;border-radius:50px;-webkit-flex-shrink:0;flex-shrink:0;margin-right:%?24?%}.eva-right[data-v-a9842764]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;-webkit-box-flex:1;-webkit-flex:1;flex:1;font-size:%?26?%;color:#909399;position:relative}.eva-right .zan-box[data-v-a9842764]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:base-line;-webkit-align-items:base-line;align-items:base-line;position:absolute;top:%?10?%;right:%?10?%}.eva-right .zan-box .yticon[data-v-a9842764]{margin-left:%?8?%}.eva-right .content[data-v-a9842764]{font-size:%?28?%;color:#333;padding-top:%?20?%}body.?%PAGE?%[data-v-a9842764]{background:#f8f8f8}',""]),t.exports=e},"558e":function(t,e,i){"use strict";var a=i("9317"),n=i.n(a);n.a},"5aa3":function(t,e,i){"use strict";var a,n=function(){var t=this,e=t.$createElement,i=t._self._c||e;return i("v-uni-view",[i("v-uni-swiper",{staticClass:"carousel",attrs:{"indicator-dots":"true",circular:"true",interval:"3000",duration:"700"}},t._l(t.data.imgList,(function(e,a){return i("v-uni-swiper-item",{key:a},[i("v-uni-view",{staticClass:"image-wrapper"},[i("v-uni-image",{class:e.loaded,attrs:{src:e.src,mode:"aspectFill"},on:{load:function(e){arguments[0]=e=t.$handleEvent(e),t.imageOnLoad("imgList",a)}}})],1)],1)})),1),i("v-uni-view",{staticClass:"scroll-view-wrapper"},[i("v-uni-scroll-view",{staticClass:"episode-panel",class:{Skeleton:!t.loaded},attrs:{"scroll-x":!0}},t._l(t.data.episodeList,(function(e,a){return i("v-uni-view",{key:a,class:{current:t.currentEpd===e},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.changeEpd(a)}}},[t._v(t._s(e))])})),1)],1),i("v-uni-view",{staticClass:"info"},[i("v-uni-view",{staticClass:"title"},[i("v-uni-text",{class:{Skeleton:!t.loaded}},[t._v(t._s(t.data.title))]),i("v-uni-text",{class:{Skeleton:!t.loaded}},[t._v(t._s(t.data.title2))])],1),i("v-uni-text",{staticClass:"yticon icon-xia"})],1),i("v-uni-view",{staticClass:"actions"},[i("v-uni-text",{staticClass:"yticon icon-fenxiang2",on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.share.apply(void 0,arguments)}}}),i("v-uni-text",{staticClass:"yticon icon-Group-"}),i("v-uni-text",{staticClass:"yticon icon-shoucang",class:{active:t.data.favorite},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.favorite.apply(void 0,arguments)}}})],1),i("v-uni-view",{staticClass:"guess"},[i("v-uni-view",{staticClass:"section-tit"},[t._v("猜你喜欢")]),i("v-uni-view",{staticClass:"guess-list"},t._l(t.data.guessList,(function(e,a){return i("v-uni-view",{key:a,staticClass:"guess-item"},[i("v-uni-view",{staticClass:"image-wrapper"},[i("v-uni-image",{class:e.loaded,attrs:{src:e.src,mode:"aspectFill"},on:{load:function(e){arguments[0]=e=t.$handleEvent(e),t.imageOnLoad("guessList",a)}}})],1),i("v-uni-text",{staticClass:"title clamp",class:{Skeleton:!t.loaded}},[t._v(t._s(e.title))]),i("v-uni-text",{staticClass:"clamp",class:{Skeleton:!t.loaded}},[t._v(t._s(e.title2))])],1)})),1)],1),i("v-uni-view",{staticClass:"evalution"},[i("v-uni-view",{staticClass:"section-tit"},[t._v("评论")]),i("v-uni-view",{staticClass:"eva-list",class:{Skeleton:!t.loaded}},t._l(t.data.evaList,(function(e,a){return i("v-uni-view",{key:a,staticClass:"eva-item"},[i("v-uni-image",{attrs:{src:e.src,mode:"aspectFill"}}),i("v-uni-view",{staticClass:"eva-right"},[i("v-uni-text",[t._v(t._s(e.nickname))]),i("v-uni-text",[t._v(t._s(e.time))]),i("v-uni-view",{staticClass:"zan-box"},[i("v-uni-text",[t._v(t._s(e.zan))]),i("v-uni-text",{staticClass:"yticon icon-shoucang"})],1),i("v-uni-text",{staticClass:"content"},[t._v(t._s(e.content))])],1)],1)})),1)],1),i("share",{ref:"share",attrs:{contentHeight:580,shareList:t.shareList}})],1)},s=[];i.d(e,"b",(function(){return n})),i.d(e,"c",(function(){return s})),i.d(e,"a",(function(){return a}))},9317:function(t,e,i){var a=i("4922");"string"===typeof a&&(a=[[t.i,a,""]]),a.locals&&(t.exports=a.locals);var n=i("4f06").default;n("3b391790",a,!0,{sourceMap:!1,shadowMode:!1})},ea08:function(t,e,i){"use strict";i.r(e);var a=i("5aa3"),n=i("eb54");for(var s in n)"default"!==s&&function(t){i.d(e,t,(function(){return n[t]}))}(s);i("558e");var o,l=i("f0c5"),r=Object(l["a"])(n["default"],a["b"],a["c"],!1,null,"a9842764",null,!1,a["a"],o);e["default"]=r.exports},eb54:function(t,e,i){"use strict";i.r(e);var a=i("2950"),n=i.n(a);for(var s in a)"default"!==s&&function(t){i.d(e,t,(function(){return a[t]}))}(s);e["default"]=n.a}}]);