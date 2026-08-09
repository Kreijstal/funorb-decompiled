/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class dxVertexLayout extends vmb {
    jagdx.IDirect3DVertexDeclaration field_b;

    dxVertexLayout(nla param0, qma[] param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var4;
        int var5;
        int var6;
        qma var7;
        int var8;
        pb var9;
        jagdx.VertexElementCollection var10;
        var10 = new jagdx.VertexElementCollection(param0.field_Sc);
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= param1.length) {
            var10.finish();
            this.field_b = param0.field_Mc.a(var10, (jagdx.IDirect3DVertexDeclaration) null);
            return;
          } else {
            var6 = 0;
            var7 = param1[var5];
            var8 = 0;
            L1: while (true) {
              if (var8 >= var7.a(-52)) {
                var5++;
                continue L0;
              } else {
                L2: {
                  var9 = var7.b(var8, 118);
                  if (pb.field_k == var9) {
                    var10.addElement(var5, 2, 0, 0, 0, var6);
                    break L2;
                  } else {
                    if (var9 == pb.field_g) {
                      var10.addElement(var5, 2, 0, 3, 0, var6);
                      break L2;
                    } else {
                      if (pb.field_d == var9) {
                        var10.addElement(var5, 4, 0, 10, 0, var6);
                        break L2;
                      } else {
                        if (pb.field_e == var9) {
                          incrementValue$0 = var4;
                          var4++;
                          var10.addElement(var5, 0, 0, 5, incrementValue$0, var6);
                          break L2;
                        } else {
                          if (var9 != pb.field_l) {
                            if (var9 != pb.field_h) {
                              if (pb.field_b != var9) {
                                break L2;
                              } else {
                                incrementValue$1 = var4;
                                var4++;
                                var10.addElement(var5, 3, 0, 5, incrementValue$1, var6);
                                break L2;
                              }
                            } else {
                              incrementValue$2 = var4;
                              var4++;
                              var10.addElement(var5, 2, 0, 5, incrementValue$2, var6);
                              break L2;
                            }
                          } else {
                            incrementValue$3 = var4;
                            var4++;
                            var10.addElement(var5, 1, 0, 5, incrementValue$3, var6);
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                var6 = var6 + var9.field_i;
                var8++;
                continue L1;
              }
            }
          }
        }
    }
}
