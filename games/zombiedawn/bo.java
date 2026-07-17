/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo extends le {
    static boolean field_n;
    static int[] field_o;
    int field_h;
    static boolean field_i;
    int field_l;
    int field_j;
    int field_k;
    int field_m;
    int field_q;
    static boolean[] field_p;

    final static String a(int param0) {
        String var1 = null;
        L0: {
          var1 = "";
          if (null == he.field_a) {
            break L0;
          } else {
            var1 = he.field_a.b(false);
            break L0;
          }
        }
        L1: {
          if (var1.length() != 0) {
            break L1;
          } else {
            var1 = t.a(1);
            break L1;
          }
        }
        if (param0 < 19) {
          L2: {
            String discarded$9 = bo.a(57);
            if (var1.length() == 0) {
              var1 = ta.field_a;
              break L2;
            } else {
              break L2;
            }
          }
          return var1;
        } else {
          L3: {
            if (var1.length() == 0) {
              var1 = ta.field_a;
              break L3;
            } else {
              break L3;
            }
          }
          return var1;
        }
    }

    public static void c(int param0) {
        field_p = null;
        field_o = null;
        if (param0 != 7644) {
            bo.c(-57);
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  L1: {
                    if (param0 <= -85) {
                      break L1;
                    } else {
                      String discarded$2 = bo.a(25);
                      break L1;
                    }
                  }
                  var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                  param1.getAppletContext().showDocument(rc.a(-1, param1, var2), "_top");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("bo.C(").append(param0).append(44);
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw sh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    bo(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((bo) this).field_h = param1;
        ((bo) this).field_l = param5;
        ((bo) this).field_j = param2;
        ((bo) this).field_k = param3;
        ((bo) this).field_q = param0;
        ((bo) this).field_m = param4;
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        if (param1 == sm.field_a) {
          return;
        } else {
          sm.field_a = param1;
          var2 = -45 % ((param0 - -16) / 41);
          if (!df.field_h) {
            if (param1 != -2) {
              if (param1 != -3) {
                nm.field_b = false;
                if (param1 < 0) {
                  var3 = param1;
                  if (-2 != var3) {
                    if (var3 == -3) {
                      rc.field_w = so.a(qg.field_g);
                      var3 = bj.field_q.b(rc.field_w, 400);
                      te.field_bb = 20 + (20 + (var3 * (bj.field_q.field_I + bj.field_q.field_x) + 4));
                      return;
                    } else {
                      throw new IllegalArgumentException("Illegal tutorial frame: " + param1);
                    }
                  } else {
                    rc.field_w = so.a(jp.field_g);
                    var3 = bj.field_q.b(rc.field_w, 400);
                    te.field_bb = 20 + (20 + (var3 * (bj.field_q.field_I + bj.field_q.field_x) + 4));
                    return;
                  }
                } else {
                  rc.field_w = me.field_Fb[vk.field_c][vf.field_f][sm.field_a];
                  var3 = bj.field_q.b(rc.field_w, 400);
                  te.field_bb = 20 + (20 + (var3 * (bj.field_q.field_I + bj.field_q.field_x) + 4));
                  return;
                }
              } else {
                nm.field_b = true;
                if (param1 < 0) {
                  var3 = param1;
                  if (-2 != var3) {
                    if (var3 == -3) {
                      rc.field_w = so.a(qg.field_g);
                      var3 = bj.field_q.b(rc.field_w, 400);
                      te.field_bb = 20 + (20 + (var3 * (bj.field_q.field_I + bj.field_q.field_x) + 4));
                      return;
                    } else {
                      throw new IllegalArgumentException("Illegal tutorial frame: " + param1);
                    }
                  } else {
                    rc.field_w = so.a(jp.field_g);
                    var3 = bj.field_q.b(rc.field_w, 400);
                    te.field_bb = 20 + (20 + (var3 * (bj.field_q.field_I + bj.field_q.field_x) + 4));
                    return;
                  }
                } else {
                  rc.field_w = me.field_Fb[vk.field_c][vf.field_f][sm.field_a];
                  var3 = bj.field_q.b(rc.field_w, 400);
                  te.field_bb = 20 + (20 + (var3 * (bj.field_q.field_I + bj.field_q.field_x) + 4));
                  return;
                }
              }
            } else {
              nm.field_b = true;
              if (param1 < 0) {
                var3 = param1;
                if (-2 != var3) {
                  if (var3 == -3) {
                    rc.field_w = so.a(qg.field_g);
                    var3 = bj.field_q.b(rc.field_w, 400);
                    te.field_bb = 20 + (20 + (var3 * (bj.field_q.field_I + bj.field_q.field_x) + 4));
                    return;
                  } else {
                    throw new IllegalArgumentException("Illegal tutorial frame: " + param1);
                  }
                } else {
                  rc.field_w = so.a(jp.field_g);
                  var3 = bj.field_q.b(rc.field_w, 400);
                  te.field_bb = 20 + (20 + (var3 * (bj.field_q.field_I + bj.field_q.field_x) + 4));
                  return;
                }
              } else {
                rc.field_w = me.field_Fb[vk.field_c][vf.field_f][sm.field_a];
                var3 = bj.field_q.b(rc.field_w, 400);
                te.field_bb = 20 + (20 + (var3 * (bj.field_q.field_I + bj.field_q.field_x) + 4));
                return;
              }
            }
          } else {
            nm.field_b = true;
            if (param1 < 0) {
              var3 = param1;
              if (-2 != var3) {
                if (var3 == -3) {
                  rc.field_w = so.a(qg.field_g);
                  var3 = bj.field_q.b(rc.field_w, 400);
                  te.field_bb = 20 + (20 + (var3 * (bj.field_q.field_I + bj.field_q.field_x) + 4));
                  return;
                } else {
                  throw new IllegalArgumentException("Illegal tutorial frame: " + param1);
                }
              } else {
                rc.field_w = so.a(jp.field_g);
                var3 = bj.field_q.b(rc.field_w, 400);
                te.field_bb = 20 + (20 + (var3 * (bj.field_q.field_I + bj.field_q.field_x) + 4));
                return;
              }
            } else {
              rc.field_w = me.field_Fb[vk.field_c][vf.field_f][sm.field_a];
              var3 = bj.field_q.b(rc.field_w, 400);
              te.field_bb = 20 + (20 + (var3 * (bj.field_q.field_I + bj.field_q.field_x) + 4));
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = false;
        field_p = new boolean[112];
    }
}
