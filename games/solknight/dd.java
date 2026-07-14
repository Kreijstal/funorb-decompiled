/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    static String[] field_d;
    static int field_b;
    static o[] field_c;
    static String field_a;

    public static void b(boolean param0) {
        field_d = null;
        field_a = null;
        if (!param0) {
            dd.b(true);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void a(boolean param0) {
        int var2 = 0;
        wi var3_ref_wi = null;
        int var3 = 0;
        ob var4 = null;
        int var4_int = 0;
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        jd var9 = null;
        wi var12 = null;
        byte[] var25 = null;
        byte[] var26 = null;
        int stackIn_7_0 = 0;
        int stackIn_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        var9 = te.field_N;
        if (param0) {
          var2 = var9.j(255);
          if (0 != var2) {
            if ((var2 ^ -1) == -2) {
              var3 = var9.e(true);
              var4 = (ob) (Object) he.field_d.a((byte) 51);
              L0: while (true) {
                if (var4 == null) {
                  if (var4 == null) {
                    je.a(false);
                    return;
                  } else {
                    var4.c(10);
                    return;
                  }
                } else {
                  if (var3 != var4.field_i) {
                    var4 = (ob) (Object) he.field_d.b(-70);
                    continue L0;
                  } else {
                    if (var4 == null) {
                      je.a(false);
                      return;
                    } else {
                      var4.c(10);
                      return;
                    }
                  }
                }
              }
            } else {
              hi.a((Throwable) null, "A1: " + oc.a(false), 1);
              je.a(false);
              return;
            }
          } else {
            var12 = (wi) (Object) bc.field_J.a((byte) 51);
            if (var12 == null) {
              L1: {
                if (param0) {
                  stackOut_37_0 = 0;
                  stackIn_38_0 = stackOut_37_0;
                  break L1;
                } else {
                  stackOut_36_0 = 1;
                  stackIn_38_0 = stackOut_36_0;
                  break L1;
                }
              }
              je.a(stackIn_38_0 != 0);
              return;
            } else {
              L2: {
                var4_int = var9.j(255);
                if (-1 != (var4_int ^ -1)) {
                  var26 = new byte[var4_int];
                  var9.a(var4_int, 0, -122, var26);
                  break L2;
                } else {
                  var5 = null;
                  break L2;
                }
              }
              var9.field_m = var9.field_m + 4;
              if (!var9.k(4)) {
                je.a(false);
                return;
              } else {
                var12.c(10);
                return;
              }
            }
          }
        } else {
          var7 = null;
          dd.a((byte) -90, (String) null, -21);
          var2 = var9.j(255);
          if (0 != var2) {
            if ((var2 ^ -1) == -2) {
              var3 = var9.e(true);
              var4 = (ob) (Object) he.field_d.a((byte) 51);
              L3: while (true) {
                if (var4 == null) {
                  if (var4 == null) {
                    je.a(false);
                    return;
                  } else {
                    var4.c(10);
                    return;
                  }
                } else {
                  if (var3 != var4.field_i) {
                    var4 = (ob) (Object) he.field_d.b(-70);
                    continue L3;
                  } else {
                    if (var4 == null) {
                      je.a(false);
                      return;
                    } else {
                      var4.c(10);
                      return;
                    }
                  }
                }
              }
            } else {
              hi.a((Throwable) null, "A1: " + oc.a(false), 1);
              je.a(false);
              return;
            }
          } else {
            var3_ref_wi = (wi) (Object) bc.field_J.a((byte) 51);
            if (var3_ref_wi == null) {
              L4: {
                if (param0) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L4;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L4;
                }
              }
              je.a(stackIn_7_0 != 0);
              return;
            } else {
              L5: {
                var4_int = var9.j(255);
                if (-1 != (var4_int ^ -1)) {
                  var25 = new byte[var4_int];
                  var9.a(var4_int, 0, -122, var25);
                  break L5;
                } else {
                  var5 = null;
                  break L5;
                }
              }
              var9.field_m = var9.field_m + 4;
              if (!var9.k(4)) {
                je.a(false);
                return;
              } else {
                var3_ref_wi.c(10);
                return;
              }
            }
          }
        }
    }

    final static void a(byte param0, String param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        ce.field_b = false;
        ta.field_b = false;
        var3 = 59 / ((param0 - -69) / 36);
        if (ah.field_e != null) {
          if (ah.field_e.field_J) {
            L0: {
              if ((param2 ^ -1) != -9) {
                break L0;
              } else {
                L1: {
                  if (!k.field_b) {
                    param1 = ah.field_h;
                    break L1;
                  } else {
                    param1 = se.field_x;
                    break L1;
                  }
                }
                param2 = 2;
                ve.field_a.a(25, me.field_h);
                break L0;
              }
            }
            L2: {
              var4 = 1;
              if (10 != param2) {
                break L2;
              } else {
                dc.d((byte) 127);
                var4 = 0;
                break L2;
              }
            }
            L3: {
              if (var4 == 0) {
                break L3;
              } else {
                L4: {
                  if (ta.field_b) {
                    param1 = bb.a(jc.field_a, new String[1], -63);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (ga.field_G) {
                    param1 = kc.field_L;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ah.field_e.a(param1, param2, (byte) -77);
                break L3;
              }
            }
            if (256 != param2) {
              if (param2 != 10) {
                if (k.field_b) {
                  return;
                } else {
                  ve.field_a.i(68);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_b = 110;
        field_a = "Continue";
    }
}
