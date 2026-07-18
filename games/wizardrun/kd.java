/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    static String field_b;
    static wd field_a;
    static boolean field_c;

    final static int a(int param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_85_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_4_0 = 0;
        var5 = wizardrun.field_H;
        try {
          L0: {
            sb.field_d = sb.field_d + 65536;
            stackOut_3_0 = sb.field_d;
            stackIn_5_0 = stackOut_3_0;
            L1: while (true) {
              if (uf.a(stackIn_5_0, fl.field_V, 65535) < 65536) {
                L2: {
                  var2_int = -1;
                  if (null != f.field_d) {
                    var2_int = f.field_d.length;
                    break L2;
                  } else {
                    if (dc.field_s != null) {
                      var2_int = dc.field_s.length;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-1 != var2_int) {
                    L4: {
                      if (fl.field_u > od.field_j) {
                        L5: {
                          od.field_j = od.field_j + 1;
                          if (fl.field_M >= od.field_j) {
                            break L5;
                          } else {
                            L6: {
                              if (null == f.field_d) {
                                break L6;
                              } else {
                                if (null != f.field_d[ej.field_c]) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            od.field_j = od.field_j - 1;
                            break L4;
                          }
                        }
                        if (od.field_j < fl.field_u) {
                          break L4;
                        } else {
                          if (null == f.field_d[(1 + ej.field_c) % var2_int]) {
                            od.field_j = od.field_j - 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    L7: {
                      if (fl.field_u <= od.field_j) {
                        L8: {
                          ra.field_o = ej.field_c;
                          if (ei.field_j) {
                            ej.field_c = ej.field_c + 1;
                            if (ej.field_c < var2_int) {
                              break L8;
                            } else {
                              ej.field_c = ej.field_c - var2_int;
                              break L8;
                            }
                          } else {
                            ej.field_c = ej.field_c - 1;
                            if (ej.field_c >= 0) {
                              break L8;
                            } else {
                              ej.field_c = ej.field_c + var2_int;
                              break L8;
                            }
                          }
                        }
                        od.field_j = od.field_j - fl.field_u;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    if (fl.field_M < od.field_j) {
                      ei.field_j = true;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L9: {
                  if (null != ra.field_p) {
                    L10: {
                      var3 = 357 + -(ra.field_p.field_s / 2);
                      var4 = 0;
                      if (w.field_c == 0) {
                        break L10;
                      } else {
                        if (dh.field_b <= var3) {
                          break L10;
                        } else {
                          if (var3 - -ra.field_p.field_p > dh.field_b) {
                            L11: {
                              if (tf.field_e <= -ra.field_p.field_z + 269) {
                                break L11;
                              } else {
                                if (tf.field_e < 269) {
                                  od.field_j = fl.field_u;
                                  var4 = 1;
                                  ei.field_j = false;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            if (tf.field_e <= 586) {
                              break L10;
                            } else {
                              if (586 - -ra.field_p.field_z > tf.field_e) {
                                ei.field_j = true;
                                var4 = 1;
                                od.field_j = fl.field_u;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L9;
                    } else {
                      if (fl.field_M >= od.field_j) {
                        break L9;
                      } else {
                        if (fi.field_B <= var3) {
                          break L9;
                        } else {
                          if (ra.field_p.field_p + var3 <= fi.field_B) {
                            break L9;
                          } else {
                            L12: {
                              if (pg.field_n <= -ra.field_p.field_z + 269) {
                                break L12;
                              } else {
                                if (pg.field_n < 269) {
                                  od.field_j = fl.field_M;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            if (586 >= pg.field_n) {
                              break L9;
                            } else {
                              if (ra.field_p.field_z + 586 <= pg.field_n) {
                                break L9;
                              } else {
                                od.field_j = fl.field_M;
                                break L9;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L9;
                  }
                }
                L13: {
                  if (!param1) {
                    break L13;
                  } else {
                    L14: {
                      jj.field_d.a(wc.a(29292, fi.field_B, pg.field_n), -82, wc.a(29292, dh.field_b, tf.field_e));
                      if (!jj.field_d.b(-1)) {
                        break L14;
                      } else {
                        if (jj.field_d.field_g != 0) {
                          if (jj.field_d.field_g != 1) {
                            break L14;
                          } else {
                            stackOut_67_0 = 2;
                            stackIn_68_0 = stackOut_67_0;
                            return stackIn_68_0;
                          }
                        } else {
                          stackOut_64_0 = 3;
                          stackIn_65_0 = stackOut_64_0;
                          return stackIn_65_0;
                        }
                      }
                    }
                    L15: while (true) {
                      if (!ae.a(103)) {
                        break L13;
                      } else {
                        L16: {
                          jj.field_d.a((byte) 11, 0);
                          if (!jj.field_d.b(-1)) {
                            break L16;
                          } else {
                            if (jj.field_d.field_g == 0) {
                              stackOut_74_0 = 3;
                              stackIn_75_0 = stackOut_74_0;
                              return stackIn_75_0;
                            } else {
                              if (1 == jj.field_d.field_g) {
                                stackOut_78_0 = 1;
                                stackIn_79_0 = stackOut_78_0;
                                return stackIn_79_0;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                        if (13 == vk.field_r) {
                          stackOut_82_0 = 1;
                          stackIn_83_0 = stackOut_82_0;
                          return stackIn_83_0;
                        } else {
                          continue L15;
                        }
                      }
                    }
                  }
                }
                stackOut_84_0 = 0;
                stackIn_85_0 = stackOut_84_0;
                break L0;
              } else {
                sb.field_d = sb.field_d - fl.field_V;
                hj.field_c = hj.field_c + 1;
                stackOut_4_0 = sb.field_d;
                stackIn_5_0 = stackOut_4_0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "kd.A(" + 586 + ',' + param1 + ')');
        }
        return stackIn_85_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Please check if address is correct";
    }
}
