/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gr extends sp implements ij {
    static int field_Z;
    private d field_X;
    static int field_Y;
    static int[][] field_W;
    static String field_ab;

    public final void a(int param0, d param1, byte param2, int param3, int param4) {
        int var6 = 0;
        if (((gr) this).field_X == param1) {
          this.m(19447);
          var6 = -23 % ((-63 - param2) / 51);
          return;
        } else {
          var6 = -23 % ((-63 - param2) / 51);
          return;
        }
    }

    gr(sd param0, ll param1) {
        super(param0, 200, 150);
        String var3 = null;
        String var5 = null;
        iq var6 = null;
        String var7 = null;
        iq var8 = null;
        String var9 = null;
        iq var10 = null;
        iq var11 = null;
        var3 = null;
        if (param1 != b.field_d) {
          if (sd.field_I != param1) {
            L0: {
              if (el.field_d != param1) {
                break L0;
              } else {
                var3 = w.field_D;
                ((gr) this).field_s = ((gr) this).field_s + 30;
                break L0;
              }
            }
            var11 = new iq(var3, (uf) null);
            var11.field_n = ((gr) this).field_n;
            var11.field_s = 80;
            var11.field_t = 50;
            var11.field_o = 0;
            var11.field_B = (ur) (Object) new va(bl.field_N, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((gr) this).c((byte) 119, var11);
            ((gr) this).field_X = this.a(-6, (uf) this, lr.field_N);
          } else {
            var7 = lh.field_a;
            var3 = var7;
            var3 = var7;
            ((gr) this).field_s = ((gr) this).field_s + 10;
            if (ui.c(-101)) {
              ((gr) this).field_s = ((gr) this).field_s + 20;
              var9 = lk.field_c;
              var3 = var9;
              var3 = var9;
              var10 = new iq(var9, (uf) null);
              var10.field_n = ((gr) this).field_n;
              var10.field_s = 80;
              var10.field_t = 50;
              var10.field_o = 0;
              var10.field_B = (ur) (Object) new va(bl.field_N, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((gr) this).c((byte) 119, var10);
              ((gr) this).field_X = this.a(-6, (uf) this, lr.field_N);
            } else {
              var8 = new iq(var7, (uf) null);
              var8.field_n = ((gr) this).field_n;
              var8.field_s = 80;
              var8.field_t = 50;
              var8.field_o = 0;
              var8.field_B = (ur) (Object) new va(bl.field_N, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((gr) this).c((byte) 119, var8);
              ((gr) this).field_X = this.a(-6, (uf) this, lr.field_N);
            }
          }
        } else {
          var5 = ko.field_U;
          var6 = new iq(var5, (uf) null);
          var6.field_n = ((gr) this).field_n;
          var6.field_s = 80;
          var6.field_t = 50;
          var6.field_o = 0;
          var6.field_B = (ur) (Object) new va(bl.field_N, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((gr) this).c((byte) 119, var6);
          ((gr) this).field_X = this.a(-6, (uf) this, lr.field_N);
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        char[] var14 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (param0 >= param1) {
          L0: {
            if (param1 < 160) {
              if (param1 == 0) {
                break L0;
              } else {
                var14 = fa.field_o;
                var10 = var14;
                var6 = var10;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var14.length <= var3) {
                    break L0;
                  } else {
                    var4 = var14[var3];
                    if (param1 != var4) {
                      var3++;
                      continue L1;
                    } else {
                      return true;
                    }
                  }
                }
              }
            } else {
              if (255 >= param1) {
                return true;
              } else {
                if (param1 == 0) {
                  break L0;
                } else {
                  var13 = fa.field_o;
                  var9 = var13;
                  var6 = var9;
                  var2 = var6;
                  var3 = 0;
                  L2: while (true) {
                    if (var13.length <= var3) {
                      break L0;
                    } else {
                      var4 = var13[var3];
                      if (param1 != var4) {
                        var3++;
                        continue L2;
                      } else {
                        return true;
                      }
                    }
                  }
                }
              }
            }
          }
          return false;
        } else {
          if (128 <= param1) {
            if (param1 < 160) {
              L3: {
                if (param1 == 0) {
                  break L3;
                } else {
                  var12 = fa.field_o;
                  var8 = var12;
                  var6 = var8;
                  var2 = var6;
                  var3 = 0;
                  L4: while (true) {
                    if (var12.length <= var3) {
                      break L3;
                    } else {
                      var4 = var12[var3];
                      if (param1 != var4) {
                        var3++;
                        continue L4;
                      } else {
                        return true;
                      }
                    }
                  }
                }
              }
              return false;
            } else {
              if (255 < param1) {
                if (param1 != 0) {
                  var11 = fa.field_o;
                  var7 = var11;
                  var6 = var7;
                  var2 = var6;
                  var3 = 0;
                  L5: while (true) {
                    if (var11.length > var3) {
                      var4 = var11[var3];
                      if (param1 != var4) {
                        var3++;
                        continue L5;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          } else {
            return true;
          }
        }
    }

    public static void g(byte param0) {
        field_W = null;
        field_ab = null;
        if (param0 <= 52) {
            gr.g((byte) -83);
        }
    }

    private final void m(int param0) {
        if (param0 != 19447) {
            return;
        }
        if (!((gr) this).field_I) {
            return;
        }
        ((gr) this).field_I = false;
    }

    private final d a(int param0, uf param1, String param2) {
        d var4 = new d(param2, param1);
        var4.field_B = (ur) (Object) new vo();
        int var5 = param0 + ((gr) this).field_s;
        ((gr) this).field_s = ((gr) this).field_s + 38;
        var4.a(false, 15, var5, 30, -16 + (((gr) this).field_n - 14));
        ((gr) this).c((byte) -119, (iq) (Object) var4);
        ((gr) this).g(param0 + -97);
        return var4;
    }

    final static String a(String param0, byte param1, r param2, String param3, String param4) {
        Object var6 = null;
        L0: {
          if (param1 >= 34) {
            break L0;
          } else {
            var6 = null;
            String discarded$2 = gr.a((String) null, (byte) -120, (r) null, (String) null, (String) null);
            break L0;
          }
        }
        if (!param2.b(0)) {
          return param0;
        } else {
          return param3 + " - " + param2.a(param4, 0) + "%";
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ab = "Red won!";
        field_Y = 0;
    }
}
