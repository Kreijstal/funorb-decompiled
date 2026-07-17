/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gr {
    static kv[] field_a;

    public static void b() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "gr.B(" + 12653 + 41);
        }
    }

    final static String a() {
        Object var1 = null;
        Object var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String stackIn_58_0 = null;
        Object stackIn_100_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_57_0 = null;
        String stackOut_55_0 = null;
        Object stackOut_99_0 = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var1 = null;
              var2 = null;
              if (gk.field_d != 0) {
                break L1;
              } else {
                if (null == rv.field_n) {
                  break L1;
                } else {
                  var2 = (Object) (Object) iu.field_l;
                  break L1;
                }
              }
            }
            L2: {
              if (gk.field_d != 2) {
                break L2;
              } else {
                int discarded$4 = -19229;
                if (!hv.a()) {
                  L3: {
                    L4: {
                      if (gl.a(3, df.field_s)) {
                        break L4;
                      } else {
                        var2 = (Object) (Object) lga.a(true, new String[1], ja.field_r);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var2 = (Object) (Object) lga.a(true, new String[1], uma.field_O);
                    break L3;
                  }
                  if (!gm.field_k) {
                    break L2;
                  } else {
                    int discarded$5 = 2;
                    vf.a((String) null, 0, 117, (String) null, (String) var2);
                    lc.b(-1);
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
                if (qh.field_l) {
                  break L5;
                } else {
                  if (null == bi.field_h) {
                    var2 = (Object) (Object) cd.field_l;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
            }
            L6: {
              if (var2 != null) {
                pp.a(vq.field_w, 5, (String) var2, 0, (String) null);
                break L6;
              } else {
                L7: {
                  var3 = cha.field_l;
                  var3 = kba.a(-123, var3);
                  var4 = "";
                  var5 = "|";
                  var6 = gk.field_d;
                  var7 = 0;
                  if (var6 == 2) {
                    var4 = lga.a(true, new String[1], iia.field_q);
                    var8 = lga.a(true, new String[1], wla.field_n);
                    var7 = -485 + (ts.field_r.field_sb + jba.field_A.field_sb - -dc.field_r.a(var8) + -dc.field_r.a(var4));
                    if (var7 >= 0) {
                      break L7;
                    } else {
                      var7 = 0;
                      break L7;
                    }
                  } else {
                    L8: {
                      if (var6 != 0) {
                        break L8;
                      } else {
                        L9: {
                          if (pw.field_w != null) {
                            break L9;
                          } else {
                            if (am.field_O) {
                              var4 = "[" + cja.field_r + "] ";
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if (null != pw.field_w) {
                          L10: {
                            L11: {
                              var6 = 1;
                              if (!ada.field_k) {
                                break L11;
                              } else {
                                if (null != jc.field_n) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            var4 = "[" + lga.a(true, new String[1], fq.field_r) + "] ";
                            if (var10 == 0) {
                              break L8;
                            } else {
                              break L10;
                            }
                          }
                          var4 = "[" + jc.field_n + "] ";
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L12: {
                      int discarded$6 = -1375;
                      if (ak.e()) {
                        stackOut_57_0 = ": ";
                        stackIn_58_0 = stackOut_57_0;
                        break L12;
                      } else {
                        stackOut_55_0 = "<img=3>: ";
                        stackIn_58_0 = stackOut_55_0;
                        break L12;
                      }
                    }
                    L13: {
                      L14: {
                        var8 = stackIn_58_0;
                        var4 = var4 + var3 + var8;
                        if (hl.field_I) {
                          break L14;
                        } else {
                          if (!sea.field_j) {
                            break L13;
                          } else {
                            var5 = "";
                            var4 = "<col=999999>" + var4 + qca.field_m + "</col>";
                            if (var10 == 0) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                      var5 = "";
                      var4 = "<col=999999>" + var4 + kna.field_h + "</col>";
                      break L13;
                    }
                    L15: {
                      var9 = dc.field_r.a(var4);
                      int discarded$7 = -1375;
                      if (ak.e()) {
                        break L15;
                      } else {
                        L16: {
                          if (!jba.field_A.field_T) {
                            break L16;
                          } else {
                            if (-jba.field_A.field_D + mk.field_p >= var9) {
                              break L16;
                            } else {
                              if (hl.field_I) {
                                var1 = (Object) (Object) "Broken!";
                                break L16;
                              } else {
                                var1 = (Object) (Object) qca.field_m;
                                break L16;
                              }
                            }
                          }
                        }
                        if (0 == jba.field_A.field_R) {
                          break L15;
                        } else {
                          if (var9 > jba.field_A.field_nb) {
                            if (!hl.field_I) {
                              fk.d(125);
                              break L15;
                            } else {
                              break L15;
                            }
                          } else {
                            break L15;
                          }
                        }
                      }
                    }
                    break L7;
                  }
                }
                L17: {
                  pp.a(jaa.field_u[var6], 5, var4 + po.c(jm.field_g.toString()), var7, var5);
                  if (!lna.field_q) {
                    ts.field_r.field_T = false;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (ts.field_r.field_T) {
                    var1 = (Object) (Object) lga.a(true, new String[2], nl.field_a);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                break L6;
              }
            }
            stackOut_99_0 = var1;
            stackIn_100_0 = stackOut_99_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (Object) (Object) decompiledCaughtException;
          throw pe.a((Throwable) var1, "gr.A(" + 2 + 41);
        }
        return (String) (Object) stackIn_100_0;
    }

    static {
    }
}
