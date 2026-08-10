/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static tb field_b;
    static boolean field_d;
    static String field_g;
    static String field_c;
    static String field_k;
    int field_j;
    int field_f;
    int field_h;
    int field_a;
    static ak field_e;
    static String field_i;

    final static boolean a(int param0, int param1, int param2) {
        if (param2 != 6774) {
            field_c = (String) null;
        }
        int var3 = g.field_N != null ? 1 : 0;
        if (-10 == (wh.field_c ^ -1)) {
            if (!(!pc.a(uh.field_d, param2 + -6772, ng.field_a, he.field_Y, wf.field_o))) {
                if (2 != uh.field_d && var3 != 0) {
                    return false;
                }
                return vm.a(wf.field_o, ng.field_a, he.field_Y, -12, uh.field_d);
            }
        }
        if (-11 == (wh.field_c ^ -1)) {
            if (var3 != 0) {
                return false;
            }
            aj.a(-1045);
            return true;
        }
        if (11 == wh.field_c) {
            if (!ch.field_c) {
                return false;
            }
            if ((qa.field_y ^ -1) == -3 && !sg.a(fa.field_r, param2 ^ 6671, li.field_e)) {
                return false;
            }
            if (-3 != (qa.field_y ^ -1)) {
                if (!(var3 == 0)) {
                    return false;
                }
            }
            if (!(!vh.a((byte) 70))) {
                String var4 = (String) null;
                ce.a(param1, (byte) -85, qa.field_y, fa.field_r, cd.field_a, (String) null);
            }
            return true;
        }
        return false;
    }

    final static void a(boolean param0, int param1) {
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_11_2 = 0;
        L0: {
          if (!ph.n(-30146)) {
            break L0;
          } else {
            L1: {
              if (tf.a((byte) 38, j.field_d)) {
                break L1;
              } else {
                if (gh.field_e != null) {
                  break L1;
                } else {
                  if (-1 > (id.field_P ^ -1)) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
            }
            L2: {
              ba.field_c = true;
              stackIn_7_0 = 1;

              if (id.field_P <= 0) {
                stackIn_8_0 = stackIn_7_0;
                stackIn_8_1 = 0;
                break L2;
              } else {
                stackIn_8_0 = stackIn_7_0;
                stackIn_8_1 = 1;
                break L2;
              }
            }
            L3: {




              if (null == gh.field_e) {


                stackIn_11_2 = 0;
                break L3;
              } else {


                stackIn_11_2 = 1;
                break L3;
              }
            }
            pd.field_d = rc.a(stackIn_8_0 != 0, stackIn_8_1 != 0, stackIn_11_2 != 0, (byte) -61, param0);
            return;
          }
        }
        L4: {
          ba.field_c = false;
          ob.field_k = false;
          if (!tf.a((byte) 64, j.field_d)) {
            break L4;
          } else {
            lk.field_F = true;
            break L4;
          }
        }
        L5: {
          if (ge.field_c) {
            ge.field_c = false;
            fm.field_e = true;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (!gn.field_b) {
            break L6;
          } else {
            mg.field_Zb = true;
            gn.field_b = false;
            break L6;
          }
        }
        L7: {
          if (param1 > 75) {
            break L7;
          } else {
            field_i = (String) null;
            break L7;
          }
        }
        qi.a(param0, (byte) -108);
    }

    final static boolean a(CharSequence param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (cb.a(true, param0, 4564)) {
              var2_int = 0;
              L1: while (true) {
                if (param0.length() <= var2_int) {
                  if (param1 == -70) {
                    stackIn_14_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    field_i = (String) null;
                    return true;
                  }
                } else {
                  if (!oe.a(param0.charAt(var2_int), -6237)) {
                    stackIn_9_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var2_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("dc.A(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        int[] var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var7 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var17 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (nm.field_Qb) {
                break L1;
              } else {
                L2: {
                  if (null != dm.field_b) {
                    break L2;
                  } else {
                    dm.field_b = cc.a(4, (byte) -115);
                    break L2;
                  }
                }
                if (!dm.field_b.field_u) {
                  break L1;
                } else {
                  var12 = o.field_g;
                  var10 = var12;
                  var5 = var10;
                  var1 = var5;
                  var16 = dm.field_b.field_t;
                  var3 = 0;
                  L3: while (true) {
                    if (var3 >= 8) {
                      var13 = j.field_d;
                      var11 = var13;
                      var7 = var11;
                      var1 = var7;
                      var17 = dm.field_b.field_t;
                      var9 = 0;
                      var3 = var9;
                      L4: while (true) {
                        if ((var9 ^ -1) <= -9) {
                          nm.field_Qb = true;
                          dm.field_b = null;
                          break L1;
                        } else {
                          var7[var9] = lb.a(var13[var9], var17[var9] ^ -1);
                          var9++;
                          continue L4;
                        }
                      }
                    } else {
                      var5[var3] = de.b(var12[var3], var16[var3]);
                      var3++;
                      continue L3;
                    }
                  }
                }
              }
            }
            L5: {
              if (qj.field_k) {
                break L5;
              } else {
                L6: {
                  if (null == mf.field_N) {
                    mf.field_N = ub.a(1, 5, 0, 107);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (!mf.field_N.field_s) {
                  break L5;
                } else {
                  var1_int = mf.field_N.field_q[0];
                  mf.field_N = null;
                  qj.field_k = true;
                  if (id.field_P < var1_int) {
                    id.field_P = var1_int;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
            }
            L7: {
              if (param0 <= -59) {
                break L7;
              } else {
                dc.a(true, 110);
                break L7;
              }
            }
            L8: {
              L9: {
                if (!nm.field_Qb) {
                  break L9;
                } else {
                  if (!qj.field_k) {
                    break L9;
                  } else {
                    fh.b((byte) -125);
                    break L8;
                  }
                }
              }
              break L8;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1_ref), "dc.D(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_i = null;
        field_c = null;
        field_e = null;
        field_b = null;
        field_k = null;
        field_g = null;
    }

    static {
        field_g = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_c = "Shortcut Reference";
        field_d = false;
        field_k = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_b = new tb();
        field_i = "You have withdrawn your request to join.";
    }
}
