
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import play.api.Play.current
/*2.2*/import models.shopping._
/*3.2*/import models.products._

object viewOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.Customer,List[ShopOrder],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(customer: models.users.Customer, orders: List[ShopOrder]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.60*/("""

"""),_display_(/*6.2*/main("Orders", customer)/*6.26*/ {_display_(Seq[Any](format.raw/*6.28*/("""

    """),format.raw/*8.5*/("""<div class="row">

        """),_display_(/*10.10*/for(i <- orders.indices) yield /*10.34*/ {_display_(Seq[Any](format.raw/*10.36*/("""
            """),_display_(/*11.14*/orders(i)),format.raw/*11.23*/("""
              
            """),format.raw/*13.13*/("""<div class="col-md-12">
                """),_display_(/*14.18*/if(flash.containsKey("success"))/*14.50*/ {_display_(Seq[Any](format.raw/*14.52*/("""
                    """),format.raw/*15.21*/("""<div class="alert alert-success">
                      """),_display_(/*16.24*/flash/*16.29*/.get("success")),format.raw/*16.44*/("""
                    """),format.raw/*17.21*/("""</div>
                """)))}),format.raw/*18.18*/("""
        
            """),format.raw/*20.13*/("""<table class="table table-bordered table-hover table-condensed">
                <thead>
                <!-- The header row-->
                <tr>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Item Price</th>
                    <th>Quantity</th>
                    <th>Total</th>
                </tr>
                </thead>
                <tbody>
                        <!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*33.22*/for(o <- orders.get(i).getItems) yield /*33.54*/ {_display_(Seq[Any](format.raw/*33.56*/("""
                        """),format.raw/*34.25*/("""<tr>
                            <td>"""),_display_(/*35.34*/o/*35.35*/.getProduct.getId),format.raw/*35.52*/("""</td>
                            <td>"""),_display_(/*36.34*/o/*36.35*/.getProduct.getDescription),format.raw/*36.61*/("""</td>
                            <td>&euro; """),_display_(/*37.41*/("%.2f".format(o.getPrice))),format.raw/*37.68*/("""</td>
                            <td>"""),_display_(/*38.34*/o/*38.35*/.getQuantity()),format.raw/*38.49*/("""</td>
                            <td>&euro; """),_display_(/*39.41*/("%.2f".format(o.getItemTotal))),format.raw/*39.72*/("""</td>
                        </tr>
                    """)))}),format.raw/*41.22*/("""<!-- End of For loop -->                
                </tbody>
            </table>
            <div class="row">
                    <div class="col-md-12">
                        <p class="text-right"><strong>Order Total: &euro; """),_display_(/*46.76*/("%.2f".format(orders.get(i).getOrderTotal))),format.raw/*46.120*/("""</strong></p>
                    </div>  
                </div>
            </div>
        """)))}),format.raw/*50.10*/("""
    """),format.raw/*51.5*/("""</div>


""")))}))
      }
    }
  }

  def render(customer:models.users.Customer,orders:List[ShopOrder]): play.twirl.api.HtmlFormat.Appendable = apply(customer,orders)

  def f:((models.users.Customer,List[ShopOrder]) => play.twirl.api.HtmlFormat.Appendable) = (customer,orders) => apply(customer,orders)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 22 16:18:20 GMT 2018
                  SOURCE: /home/paul/Desktop/lab6/app/views/viewOrders.scala.html
                  HASH: 90649c7bdf3e0ac1c39225fecfcd431989447012
                  MATRIX: 651->1|687->31|719->57|1084->83|1237->141|1265->144|1297->168|1336->170|1368->176|1423->204|1463->228|1503->230|1544->244|1574->253|1630->281|1698->322|1739->354|1779->356|1828->377|1912->434|1926->439|1962->454|2011->475|2066->499|2116->521|2658->1036|2706->1068|2746->1070|2799->1095|2864->1133|2874->1134|2912->1151|2978->1190|2988->1191|3035->1217|3108->1263|3156->1290|3222->1329|3232->1330|3267->1344|3340->1390|3392->1421|3480->1478|3743->1714|3809->1758|3934->1852|3966->1857
                  LINES: 24->1|25->2|26->3|31->4|36->4|38->6|38->6|38->6|40->8|42->10|42->10|42->10|43->11|43->11|45->13|46->14|46->14|46->14|47->15|48->16|48->16|48->16|49->17|50->18|52->20|65->33|65->33|65->33|66->34|67->35|67->35|67->35|68->36|68->36|68->36|69->37|69->37|70->38|70->38|70->38|71->39|71->39|73->41|78->46|78->46|82->50|83->51
                  -- GENERATED --
              */
          