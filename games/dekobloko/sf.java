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
        Object var1 = null;
        Object var2 = null;
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
        Object stackIn_97_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_57_0 = null;
        String stackOut_55_0 = null;
        Object stackOut_96_0 = null;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var1 = null;
              var2 = null;
              if ((pk.field_r ^ -1) != -1) {
                break L1;
              } else {
                if (g.field_N != null) {
                  var2 = gh.field_f;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (2 != pk.field_r) {
                break L2;
              } else {
                if (!hl.a((byte) -53)) {
                  L3: {
                    L4: {
                      if (qe.a(cf.field_c, 3)) {
                        break L4;
                      } else {
                        var2 = cm.a((byte) 96, se.field_V, new String[]{ed.field_c});
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var2 = cm.a((byte) 87, dc.field_k, new String[]{ed.field_c});
                    break L3;
                  }
                  if (jh.field_h) {
                    ca.a((String) null, (String) null, (String) (var2), (byte) 125, 2, 0);
                    qn.l(13);
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            }
            L5: {
              if (null != var2) {
                break L5;
              } else {
                if (sc.field_m) {
                  break L5;
                } else {
                  if (tf.field_gb != null) {
                    break L5;
                  } else {
                    var2 = bl.field_W;
                    break L5;
                  }
                }
              }
            }
            L6: {
              if (null != var2) {
                cl.a((String) null, 0, ij.field_c, (String) (var2), -24503);
                break L6;
              } else {
                L7: {
                  L8: {
                    var3_ref_String = oa.field_f;
                    var3_ref_String = b.a(107, var3_ref_String);
                    var4 = "";
                    var5 = "|";
                    var6 = pk.field_r;
                    var7 = 0;
                    if (var6 != 2) {
                      break L8;
                    } else {
                      L9: {
                        var4 = cm.a((byte) 81, oj.field_b, new String[]{ed.field_c});
                        var8 = cm.a((byte) 125, im.field_j, new String[]{var3_ref_String});
                        var7 = -485 + jb.field_f.field_mb + wj.field_Mb.field_mb - (-ff.field_o.a(var8) + ff.field_o.a(var4));
                        if (0 <= var7) {
                          break L9;
                        } else {
                          var7 = 0;
                          break L9;
                        }
                      }
                      if (var10 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L10: {
                    if (0 == var6) {
                      L11: {
                        if (cd.field_m != null) {
                          break L11;
                        } else {
                          if (!ii.field_q) {
                            break L11;
                          } else {
                            var4 = "[" + uc.field_b + "] ";
                            break L11;
                          }
                        }
                      }
                      if (null == cd.field_m) {
                        break L10;
                      } else {
                        L12: {
                          L13: {
                            if (!wh.field_b) {
                              break L13;
                            } else {
                              if (null == f.field_q) {
                                break L13;
                              } else {
                                var4 = "[" + f.field_q + "] ";
                                if (var10 == 0) {
                                  break L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                          var4 = "[" + cm.a((byte) 115, hf.field_a, new String[]{cd.field_m.field_Vb}) + "] ";
                          break L12;
                        }
                        var6 = 1;
                        break L10;
                      }
                    } else {
                      break L10;
                    }
                  }
                  L14: {
                    if (rc.a(false)) {
                      stackOut_57_0 = ": ";
                      stackIn_58_0 = stackOut_57_0;
                      break L14;
                    } else {
                      stackOut_55_0 = "<img=3>: ";
                      stackIn_58_0 = stackOut_55_0;
                      break L14;
                    }
                  }
                  L15: {
                    L16: {
                      var8 = stackIn_58_0;
                      var4 = var4 + var3_ref_String + var8;
                      if (wc.field_n) {
                        break L16;
                      } else {
                        if (wl.field_p) {
                          var5 = "";
                          var4 = "<col=999999>" + var4 + ci.field_d + "</col>";
                          if (var10 == 0) {
                            break L15;
                          } else {
                            break L16;
                          }
                        } else {
                          break L15;
                        }
                      }
                    }
                    var5 = "";
                    var4 = "<col=999999>" + var4 + vg.field_s + "</col>";
                    break L15;
                  }
                  var9 = ff.field_o.a(var4);
                  if (!rc.a(false)) {
                    L17: {
                      if (!wj.field_Mb.field_jb) {
                        break L17;
                      } else {
                        if ((bh.field_g + -wj.field_Mb.field_E ^ -1) > (var9 ^ -1)) {
                          if (wc.field_n) {
                            var1 = "Broken!";
                            break L17;
                          } else {
                            var1 = ci.field_d;
                            break L17;
                          }
                        } else {
                          break L17;
                        }
                      }
                    }
                    if (-1 == (wj.field_Mb.field_ob ^ -1)) {
                      break L7;
                    } else {
                      if ((var9 ^ -1) >= (wj.field_Mb.field_xb ^ -1)) {
                        break L7;
                      } else {
                        if (!wc.field_n) {
                          aj.a(-1045);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                  } else {
                    break L7;
                  }
                }
                L18: {
                  cl.a(var5, var7, tl.field_q[var6], var4 + mm.c(dj.field_ab.toString()), -24503);
                  if (!jg.field_i) {
                    jb.field_f.field_jb = false;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (!jb.field_f.field_jb) {
                    break L19;
                  } else {
                    var1 = cm.a((byte) 126, vf.field_d, new String[]{var3_ref_String, ed.field_c});
                    break L19;
                  }
                }
                break L6;
              }
            }
            var3 = 125 % ((30 - param0) / 41);
            stackOut_96_0 = var1;
            stackIn_97_0 = stackOut_96_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (var1), "sf.C(" + param0 + ')');
        }
        return (String) ((Object) stackIn_97_0);
    }

    abstract int a(boolean param0);

    public static void f(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_y = null;
              field_E = null;
              if (param0 <= -123) {
                break L1;
              } else {
                field_B = -69;
                break L1;
              }
            }
            field_C = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "sf.A(" + param0 + ')');
        }
    }

    sf() {
        this.field_z = true;
    }

    static {
        field_C = new int[8192];
        field_y = new long[32];
        field_B = 0;
        field_E = new String[]{"All scores", "My scores", "Best each"};
    }
}
