//***********************************************
//  Javascript Menu (c) 2006 - 2008, by Deluxe-Menu.com
//  Trial Version
//
//  version 3.2
//  E-mail:  cs@deluxe-menu.com
//***********************************************

//***********************************************
// Obfuscated by Javascript Obfuscator
// http://javascript-source.com
//***********************************************


function dm_ext_hideAllSubmenus(mInd){_dmsm(mInd);};function dm_ext_changeItem(mInd,smInd,itInd,iParams){var menu=dm_menu[mInd],smVar=menu.m[smInd],itVar=smVar.i[itInd],itObj=_dmoi(itVar.id+'tbl');with(itVar){text=(iParams[0]?iParams[0]:text);link=_dmll(iParams[1]);target=_dmsl(iParams[5]);status=_dmst(statusString,text,link);tip=_dmpr(iParams[4],'');itStyle=_dmls(menu,iParams[6],1);icon=_dmkl([_dmpr(iParams[2],icon[0]),_dmpr(iParams[3],icon[1])],pathPrefix_img);_dII(itVar);isDisabled=(target=='_')?1:0;if(itObj){_dmoi(id+'tdT').innerHTML=text;with(itObj){title=tip;style.width=itStyle.itWidth;};_dmh(itVar,1);_dmh(itVar,0);};};};function _dme(){if(b_OP&&b_VER<7)return alert('Javascript Menu by Deluxe-Menu.com:\nThis browser doesn\'t support dynamic menu modifications.');};function dm_ext_createSubmenu(mInd,smInd,itInd,iParamsArr){_dme();var menu=dm_menu[mInd],smVar=menu.m[smInd],itVar=smVar.i[itInd];if(itVar.childID)return 0;_dmsp(menu,smVar,itVar,iParamsArr[7]);curMenu.itInd=curMenu.smVar.i.ln();_dmip(menu,curMenu.smVar,curMenu.itInd,iParamsArr,statusString);itVar.childID=curMenu.smVar.id;var itTbl=dm_gE(itVar.id+'tbl');if(itTbl){var s=_dmir(itVar),r=itTbl.rows[0],aObj=d_o.createElement('TD');with(itVar){aObj.id=id+'tdA';aObj.style.padding=curMenu.smVar.smStyle.itPadding+dUnits;var arrImg=smInd?itStyle.arrowSub[0]:itStyle.arrowMain[0];aObj.innerHTML=_dmiz(id+'arr',arrImg,arrowW,arrowH,'');};r.appendChild(aObj);};var mm=_dmoi(menu.m[0].id).offsetParent;mm.innerHTML+=_dmda(mInd,curMenu.smVar.ind);_dmni(curMenu.smVar);return 1;};function dm_ext_deleteSubmenu(mInd,smInd){_dme();var menu=dm_menu[mInd],smVar=menu.m[smInd];_dmvi(smVar.rootItemID).childID='';dm_gE(smVar.rootItemID+'tdA').style.display='none';};function dm_ext_addItem(mInd,smInd,iParamsArr){dm_ext_addItemPos(mInd,smInd,iParamsArr,-1)};function dm_ext_addItemPos(mInd,smInd,iParamsArr,Pos){_dme();var menu=dm_menu[mInd],smVar=menu.m[smInd],itInd=smVar.i.length;_dmip(menu,smVar,itInd,iParamsArr,statusString);var itVar=smVar.i[itInd],smObj=_dmoi(smVar.id+'tbl'),frame=(itVar.smInd&&menu.isCrossFrame&&cfType==1)?'parent.frames['+menu.cfMFInd+'].':'',itObj=d_o.createElement('TD');itObj.id=itVar.id+'td';itObj.innerHTML=_dmit(menu,smVar,itVar,frame);if(smObj){with(smObj)var rowObj=smVar.isHoriz?rows[0]:insertRow(Pos);if(!smVar.isHoriz)rowObj.id=itVar.id+'R';if(smVar.isHoriz){if(Pos>=0)rowObj.insertBefore(itObj,rowObj.cells[Pos]);else rowObj.appendChild(itObj)}else rowObj.appendChild(itObj)};};function _dmv(id,vis){var itTDObj=_dmoi(id+'td');if(itTDObj)itTDObj.style.display=vis?'':'none';var itTRObj=_dmoi(id+'R');if(itTRObj)itTRObj.style.display=vis?'':'none';};function dm_ext_deleteItem(mInd,smInd,itInd){_dme();var smVar=dm_menu[mInd].m[smInd],itVar=smVar.i[itInd];itVar.isDeleted=1;_dmv(itVar.id,0);};function dm_ext_changeItemVisibility(mInd,smInd,itInd,vis){_dme();var smVar=dm_menu[mInd].m[smInd],itVar=smVar.i[itInd];itVar.isVisible=vis;_dmv(itVar.id,vis);};function dm_ext_getItemParams(mInd,smInd,itInd){with(dm_menu[mInd].m[smInd].i[itInd])var iparams=[id,(childID?1:0),text,link,target,status,tip,align,icon,isDisabled,isPressed,isVisible,isDeleted];return iparams;};function dm_ext_getSubmenuParams(mInd,smInd){with(dm_menu[mInd].m[smInd])var smparams=[id,i.length,rootItemID,level,isHoriz];return smparams;};function dm_ext_getMenuParams(mInd){with(dm_menu[mInd])var mparams=[m.length,curPressedSm,curPressedIt];return mparams;};
