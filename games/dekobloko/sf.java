/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sf extends be {
    static String[] field_E;
    boolean field_D;
    static int field_B;
    static int[] field_C;
    static long[] field_y;
    volatile boolean field_z;
    boolean field_A;

    abstract byte[] g(byte param0);

    final static String c(int param0) {
        Object var1_ref2 = null;
        RuntimeException var1 = null;
        String var1_ref = null;
        Object var2 = null;
        String var2_ref = null;
        String var3_ref_String = null;
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String stackIn_58_0 = null;
        RuntimeException stackIn_97_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_57_0 = null;
        String stackOut_55_0 = null;
        String stackOut_96_0 = null;
        var1_ref2 = null;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            var1_ref2 = null;
            var2 = null;
            if ((pk.field_r ^ -1) != -1) {
              break L0;
            } else {
              if (g.field_N != null) {
                var2_ref = gh.field_f;
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (2 != pk.field_r) {
              break L1;
            } else {
              if (!hl.a((byte) -53)) {
                L2: {
                  L3: {
                    if (qe.a(cf.field_c, 3)) {
                      break L3;
                    } else {
                      var2_ref = cm.a((byte) 96, se.field_V, new String[1]);
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_ref = cm.a((byte) 87, dc.field_k, new String[1]);
                  break L2;
                }
                if (jh.field_h) {
                  ca.a((String) null, (String) null, var2_ref, (byte) 125, 2, 0);
                  qn.l(13);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
          }
          L4: {
            if (null != var2_ref) {
              break L4;
            } else {
              if (sc.field_m) {
                break L4;
              } else {
                if (tf.field_gb != null) {
                  break L4;
                } else {
                  var2_ref = bl.field_W;
                  break L4;
                }
              }
            }
          }
          L5: {
            if (null != var2_ref) {
              cl.a((String) null, 0, ij.field_c, var2_ref, -24503);
              break L5;
            } else {
              L6: {
                L7: {
                  var3_ref_String = oa.field_f;
                  var3_ref_String = b.a(107, var3_ref_String);
                  var4 = "";
                  var5 = "|";
                  var6 = pk.field_r;
                  var7 = 0;
                  if (var6 != 2) {
                    break L7;
                  } else {
                    L8: {
                      var4 = cm.a((byte) 81, oj.field_b, new String[1]);
                      var8 = cm.a((byte) 125, im.field_j, new String[1]);
                      var7 = -485 + jb.field_f.field_mb + wj.field_Mb.field_mb - (-ff.field_o.a(var8) + ff.field_o.a(var4));
                      if (0 <= var7) {
                        break L8;
                      } else {
                        var7 = 0;
                        break L8;
                      }
                    }
                    if (var10 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                L9: {
                  if (0 == var6) {
                    L10: {
                      if (cd.field_m != null) {
                        break L10;
                      } else {
                        if (!ii.field_q) {
                          break L10;
                        } else {
                          var4 = "[" + uc.field_b + "] ";
                          break L10;
                        }
                      }
                    }
                    if (null == cd.field_m) {
                      break L9;
                    } else {
                      L11: {
                        L12: {
                          if (!wh.field_b) {
                            break L12;
                          } else {
                            if (null == f.field_q) {
                              break L12;
                            } else {
                              var4 = "[" + f.field_q + "] ";
                              if (var10 == 0) {
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        var4 = "[" + cm.a((byte) 115, hf.field_a, new String[1]) + "] ";
                        break L11;
                      }
                      var6 = 1;
                      break L9;
                    }
                  } else {
                    break L9;
                  }
                }
                L13: {
                  if (rc.a(false)) {
                    stackOut_57_0 = ": ";
                    stackIn_58_0 = stackOut_57_0;
                    break L13;
                  } else {
                    stackOut_55_0 = "<img=3>: ";
                    stackIn_58_0 = stackOut_55_0;
                    break L13;
                  }
                }
                L14: {
                  L15: {
                    var8 = stackIn_58_0;
                    var4 = var4 + var3_ref_String + var8;
                    if (wc.field_n) {
                      break L15;
                    } else {
                      if (wl.field_p) {
                        var5 = "";
                        var4 = "<col=999999>" + var4 + ci.field_d + "</col>";
                        if (var10 == 0) {
                          break L14;
                        } else {
                          break L15;
                        }
                      } else {
                        break L14;
                      }
                    }
                  }
                  var5 = "";
                  var4 = "<col=999999>" + var4 + vg.field_s + "</col>";
                  break L14;
                }
                var9 = ff.field_o.a(var4);
                if (!rc.a(false)) {
                  L16: {
                    if (!wj.field_Mb.field_jb) {
                      break L16;
                    } else {
                      if ((bh.field_g + -wj.field_Mb.field_E ^ -1) > (var9 ^ -1)) {
                        if (wc.field_n) {
                          var1_ref = "Broken!";
                          break L16;
                        } else {
                          var1_ref = ci.field_d;
                          break L16;
                        }
                      } else {
                        break L16;
                      }
                    }
                  }
                  if (-1 == (wj.field_Mb.field_ob ^ -1)) {
                    break L6;
                  } else {
                    if ((var9 ^ -1) >= (wj.field_Mb.field_xb ^ -1)) {
                      break L6;
                    } else {
                      if (!wc.field_n) {
                        aj.a(-1045);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                } else {
                  break L6;
                }
              }
              L17: {
                cl.a(var5, var7, tl.field_q[var6], var4 + mm.c(dj.field_ab.toString()), -24503);
                if (!jg.field_i) {
                  jb.field_f.field_jb = false;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (!jb.field_f.field_jb) {
                  break L18;
                } else {
                  var1_ref = cm.a((byte) 126, vf.field_d, new String[2]);
                  break L18;
                }
              }
              break L5;
            }
          }
          var3 = 125 % ((30 - param0) / 41);
          stackOut_96_0 = (String) var1_ref;
          stackIn_97_0 = (RuntimeException) (Object) stackOut_96_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "sf.C(" + param0 + 41);
        }
        return (String) (Object) stackIn_97_0;
    }

    abstract int a(boolean param0);

    public static void f(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_y = null;
            field_E = null;
            if (param0 <= -123) {
              break L0;
            } else {
              field_B = -69;
              break L0;
            }
          }
          field_C = null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "sf.A(" + param0 + 41);
        }
    }

    sf() {
        ((sf) this).field_z = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new int[8192];
        field_y = new long[32];
        field_B = 0;
        field_E = new String[]{"All scores", "My scores", "Best each"};
    }
}
