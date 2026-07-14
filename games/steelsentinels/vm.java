/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm extends ia {
    static String field_q;
    private jf field_n;
    static gk[] field_r;
    static String field_o;
    private jf field_p;

    final vd a(String param0, int param1) {
        String var3 = null;
        String var4 = null;
        Object var5 = null;
        var3 = ((vm) this).field_p.field_y.toLowerCase();
        var4 = param0.toLowerCase();
        if (param1 == -1) {
          if (var4.length() != 0) {
            if (lk.a(var4, (byte) 62, var3)) {
              if (this.b(1, param0)) {
                return fa.field_d;
              } else {
                return vf.field_b;
              }
            } else {
              return fa.field_d;
            }
          } else {
            return fa.field_d;
          }
        } else {
          var5 = null;
          boolean discarded$5 = vm.b((String) null, 32);
          if (var4.length() != 0) {
            if (lk.a(var4, (byte) 62, var3)) {
              if (this.b(1, param0)) {
                return fa.field_d;
              } else {
                return vf.field_b;
              }
            } else {
              return fa.field_d;
            }
          } else {
            return fa.field_d;
          }
        }
    }

    private final boolean b(int param0, String param1) {
        int var5 = 0;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        if (param0 == 1) {
          var12 = ((vm) this).field_n.field_y.toLowerCase();
          var13 = param1.toLowerCase();
          if (-1 > (var12.length() ^ -1)) {
            if (0 < var13.length()) {
              var5 = var12.lastIndexOf("@");
              if (0 <= var5) {
                if (var5 < var12.length() + -1) {
                  var14 = var12.substring(0, var5);
                  var15 = var12.substring(1 + var5);
                  if (-1 >= var13.indexOf(var14)) {
                    return true;
                  } else {
                    if (-1 <= var13.indexOf(var15)) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          vm.d((byte) 43);
          var8 = ((vm) this).field_n.field_y.toLowerCase();
          var9 = param1.toLowerCase();
          if (-1 > (var8.length() ^ -1)) {
            if (0 < var9.length()) {
              var5 = var8.lastIndexOf("@");
              if (0 <= var5) {
                if (var5 < var8.length() + -1) {
                  var10 = var8.substring(0, var5);
                  var11 = var8.substring(1 + var5);
                  if (-1 >= var9.indexOf(var10)) {
                    return true;
                  } else {
                    if (-1 > var9.indexOf(var11)) {
                      return false;
                    } else {
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final String a(int param0, String param1) {
        String var4 = null;
        String var5 = null;
        String var6 = null;
        var6 = ((vm) this).field_p.field_y.toLowerCase();
        var4 = param1.toLowerCase();
        if (0 != var4.length()) {
          var5 = var4;
          if (mn.a(-30157, var5)) {
            return el.field_Zb;
          } else {
            if (vm.b(var5, 109)) {
              return ua.field_u;
            } else {
              if (eb.b(var5, 29974)) {
                return pc.field_s;
              } else {
                if (param0 == 100) {
                  if (!this.b(1, param1)) {
                    if (var6.length() > 0) {
                      if (!nj.a(var5, 300, var6)) {
                        if (fj.a(var6, -7036, var5)) {
                          return kj.field_C;
                        } else {
                          if (wl.a(var5, true, var6)) {
                            return pd.field_R;
                          } else {
                            return el.field_Zb;
                          }
                        }
                      } else {
                        return pd.field_R;
                      }
                    } else {
                      return tm.field_b;
                    }
                  } else {
                    return ej.field_z;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    vm(jf param0, jf param1, jf param2) {
        super(param0);
        ((vm) this).field_p = param1;
        ((vm) this).field_n = param2;
    }

    public static void d(byte param0) {
        int var1 = 56 % ((param0 - 10) / 37);
        field_o = null;
        field_q = null;
        field_r = null;
    }

    final static void a(int param0, int param1, rh param2) {
        int var4 = 0;
        Object var5 = null;
        kj var6 = null;
        var6 = mm.field_g;
        var6.a(param0, (byte) -117);
        var6.field_p = var6.field_p + 1;
        var4 = var6.field_p;
        var6.a((byte) 108, 1);
        if (param2.field_r != null) {
          var6.a((byte) 125, param2.field_r.length);
          var6.a(param2.field_r.length, (byte) -122, 0, param2.field_r);
          int discarded$8 = var6.f(-101, var4);
          var6.field_p = var6.field_p - 4;
          param2.field_x = var6.i(0);
          var6.b((byte) 101, var6.field_p + -var4);
          if (param1 < -38) {
            return;
          } else {
            var5 = null;
            boolean discarded$9 = vm.b((String) null, 57);
            return;
          }
        } else {
          var6.a((byte) 113, 0);
          int discarded$10 = var6.f(-101, var4);
          var6.field_p = var6.field_p - 4;
          param2.field_x = var6.i(0);
          var6.b((byte) 101, var6.field_p + -var4);
          if (param1 < -38) {
            return;
          } else {
            var5 = null;
            boolean discarded$11 = vm.b((String) null, 57);
            return;
          }
        }
    }

    final static boolean b(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = SteelSentinels.field_G;
        var2 = 0;
        L0: while (true) {
          if (param0.length() > var2) {
            var3 = param0.charAt(var2);
            if (!kf.a((char) var3, (byte) -59)) {
              if (!oa.a(-4278, (char) var3)) {
                return true;
              } else {
                var2++;
                var2++;
                continue L0;
              }
            } else {
              var2++;
              var2++;
              continue L0;
            }
          } else {
            var3 = 49 / ((param1 - -23) / 51);
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "A highscore of <%0> has been achieved!";
        field_o = "<%1> was too close to a missile intercepted by <%0>";
    }
}
