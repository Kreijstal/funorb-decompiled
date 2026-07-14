/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm extends fa {
    int[] field_o;
    static String field_n;
    static boolean field_l;
    int field_p;
    static ak field_m;
    static String field_k;

    final static boolean a(String param0, int param1) {
        if (param1 != -1) {
            return true;
        }
        CharSequence var3 = (CharSequence) (Object) param0;
        return eq.field_Hb.equals((Object) (Object) dh.a(var3, (byte) 72));
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        Object var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        if (param2 == 0) {
          if (he.field_f != null) {
            var3 = he.field_f.b(-126, param1);
            if (-1 != (var3 ^ -1)) {
              if (2 == var3) {
                if (he.field_f.field_cb != null) {
                  if (!he.field_f.field_cb.equals((Object) (Object) "")) {
                    L0: {
                      if (91 != he.field_f.field_cb.charAt(0)) {
                        var8 = (CharSequence) (Object) he.field_f.field_cb;
                        var4 = dh.a(var8, (byte) 26);
                        break L0;
                      } else {
                        var4 = he.field_f.field_cb;
                        break L0;
                      }
                    }
                    L1: {
                      var5 = null;
                      if (il.field_e != -1) {
                        break L1;
                      } else {
                        var5 = jf.a(var4, param0, (byte) 108);
                        break L1;
                      }
                    }
                    L2: {
                      if (-2 == il.field_e) {
                        var5 = ff.a(param0, var4, (byte) -106);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if ((il.field_e ^ -1) == -3) {
                        var5 = mj.a(-34, var4, param0);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (il.field_e == 3) {
                        var5 = aq.a(var4, param0, var4, -20867);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    if (var5 != null) {
                      var6 = null;
                      ti.a(0, (String) null, var4, (byte) -59, 2, var5);
                      he.field_f = null;
                      il.field_e = -1;
                      return;
                    } else {
                      he.field_f = null;
                      il.field_e = -1;
                      return;
                    }
                  } else {
                    he.field_f = null;
                    il.field_e = -1;
                    return;
                  }
                } else {
                  he.field_f = null;
                  il.field_e = -1;
                  return;
                }
              } else {
                he.field_f = null;
                il.field_e = -1;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          field_l = true;
          if (he.field_f != null) {
            L5: {
              var3 = he.field_f.b(-126, param1);
              if (-1 != (var3 ^ -1)) {
                if (2 == var3) {
                  if (he.field_f.field_cb != null) {
                    if (!he.field_f.field_cb.equals((Object) (Object) "")) {
                      L6: {
                        if (91 != he.field_f.field_cb.charAt(0)) {
                          var7 = (CharSequence) (Object) he.field_f.field_cb;
                          var4 = dh.a(var7, (byte) 26);
                          break L6;
                        } else {
                          var4 = he.field_f.field_cb;
                          break L6;
                        }
                      }
                      L7: {
                        var5 = null;
                        if (il.field_e != -1) {
                          break L7;
                        } else {
                          var5 = jf.a(var4, param0, (byte) 108);
                          break L7;
                        }
                      }
                      L8: {
                        if (-2 == il.field_e) {
                          var5 = ff.a(param0, var4, (byte) -106);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if ((il.field_e ^ -1) == -3) {
                          var5 = mj.a(-34, var4, param0);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (il.field_e == 3) {
                          var5 = aq.a(var4, param0, var4, -20867);
                          var4 = var5;
                          var4 = var5;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      if (var5 != null) {
                        var6 = null;
                        ti.a(0, (String) null, var4, (byte) -59, 2, var5);
                        he.field_f = null;
                        il.field_e = -1;
                        break L5;
                      } else {
                        he.field_f = null;
                        il.field_e = -1;
                        return;
                      }
                    } else {
                      he.field_f = null;
                      il.field_e = -1;
                      return;
                    }
                  } else {
                    he.field_f = null;
                    il.field_e = -1;
                    return;
                  }
                } else {
                  he.field_f = null;
                  il.field_e = -1;
                  return;
                }
              } else {
                break L5;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_m = null;
        field_k = null;
        field_n = null;
        if (param0 >= -99) {
            sm.a((byte) -113);
        }
    }

    private sm() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = false;
        field_k = "(1 player wants to join)";
        field_n = "Please select an option in the '<%0>' row.";
    }
}
