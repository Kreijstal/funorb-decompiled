/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class un {
    static qt[] field_b;
    static r field_c;
    static cn field_d;
    static int[] field_a;
    static ml field_e;

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != 106) {
            field_a = (int[]) null;
        }
    }

    final static void a(nu param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            ae.field_G = param1;
            sh.field_a = param0;
            if (param2 > 45) {
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= 4) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  mn.field_b[var3_int] = 0;
                  var3_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("un.B(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final synchronized static byte[] a(int param0, boolean param1) {
        byte[][] fieldTemp$139 = null;
        int fieldTemp$140 = 0;
        int fieldTemp$141 = 0;
        byte[][] fieldTemp$142 = null;
        int fieldTemp$143 = 0;
        int fieldTemp$144 = 0;
        int fieldTemp$145 = 0;
        byte[][] fieldTemp$146 = null;
        int fieldTemp$147 = 0;
        byte[][] fieldTemp$148 = null;
        int fieldTemp$149 = 0;
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if (!param1) {
          if (param0 != 100) {
            if (param0 != 5000) {
              L0: {
                if (30000 != param0) {
                  break L0;
                } else {
                  if (-1 <= (ep.field_d ^ -1)) {
                    break L0;
                  } else {
                    fieldTemp$139 = vt.field_d;
                    fieldTemp$140 = ep.field_d - 1;
                    ep.field_d = ep.field_d - 1;
                    var2_ref_byte__ = fieldTemp$139[fieldTemp$140];
                    vt.field_d[ep.field_d] = null;
                    return var2_ref_byte__;
                  }
                }
              }
              if (null != le.field_e) {
                var2 = 0;
                L1: while (true) {
                  if (us.field_i.length <= var2) {
                    return new byte[param0];
                  } else {
                    if (us.field_i[var2] == param0) {
                      if (uj.field_D[var2] > 0) {
                        uj.field_D[var2] = uj.field_D[var2] - 1;
                        var3 = le.field_e[var2][uj.field_D[var2] - 1];
                        le.field_e[var2][uj.field_D[var2]] = null;
                        return var3;
                      } else {
                        var2++;
                        continue L1;
                      }
                    } else {
                      var2++;
                      continue L1;
                    }
                  }
                }
              } else {
                return new byte[param0];
              }
            } else {
              if ((fu.field_h ^ -1) < -1) {
                fieldTemp$141 = fu.field_h - 1;
                fu.field_h = fu.field_h - 1;
                var2_ref_byte__ = sg.field_b[fieldTemp$141];
                sg.field_b[fu.field_h] = null;
                return var2_ref_byte__;
              } else {
                L2: {
                  if (30000 != param0) {
                    break L2;
                  } else {
                    if (-1 <= (ep.field_d ^ -1)) {
                      break L2;
                    } else {
                      fieldTemp$142 = vt.field_d;
                      fieldTemp$143 = ep.field_d - 1;
                      ep.field_d = ep.field_d - 1;
                      var2_ref_byte__ = fieldTemp$142[fieldTemp$143];
                      vt.field_d[ep.field_d] = null;
                      return var2_ref_byte__;
                    }
                  }
                }
                if (null != le.field_e) {
                  var2 = 0;
                  L3: while (true) {
                    if (us.field_i.length <= var2) {
                      return new byte[param0];
                    } else {
                      if (us.field_i[var2] == param0) {
                        if (uj.field_D[var2] > 0) {
                          uj.field_D[var2] = uj.field_D[var2] - 1;
                          var3 = le.field_e[var2][uj.field_D[var2] - 1];
                          le.field_e[var2][uj.field_D[var2]] = null;
                          return var3;
                        } else {
                          var2++;
                          continue L3;
                        }
                      } else {
                        var2++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  return new byte[param0];
                }
              }
            }
          } else {
            if (0 < li.field_h) {
              fieldTemp$144 = li.field_h - 1;
              li.field_h = li.field_h - 1;
              var2_ref_byte__ = vb.field_g[fieldTemp$144];
              vb.field_g[li.field_h] = null;
              return var2_ref_byte__;
            } else {
              if (param0 == 5000) {
                if ((fu.field_h ^ -1) < -1) {
                  fieldTemp$145 = fu.field_h - 1;
                  fu.field_h = fu.field_h - 1;
                  var2_ref_byte__ = sg.field_b[fieldTemp$145];
                  sg.field_b[fu.field_h] = null;
                  return var2_ref_byte__;
                } else {
                  if (30000 == param0) {
                    if (-1 <= (ep.field_d ^ -1)) {
                      if (null != le.field_e) {
                        var2 = 0;
                        L4: while (true) {
                          if (us.field_i.length <= var2) {
                            return new byte[param0];
                          } else {
                            if (us.field_i[var2] == param0) {
                              if (uj.field_D[var2] > 0) {
                                uj.field_D[var2] = uj.field_D[var2] - 1;
                                var3 = le.field_e[var2][uj.field_D[var2] - 1];
                                le.field_e[var2][uj.field_D[var2]] = null;
                                return var3;
                              } else {
                                var2++;
                                continue L4;
                              }
                            } else {
                              var2++;
                              continue L4;
                            }
                          }
                        }
                      } else {
                        return new byte[param0];
                      }
                    } else {
                      fieldTemp$146 = vt.field_d;
                      fieldTemp$147 = ep.field_d - 1;
                      ep.field_d = ep.field_d - 1;
                      var2_ref_byte__ = fieldTemp$146[fieldTemp$147];
                      vt.field_d[ep.field_d] = null;
                      return var2_ref_byte__;
                    }
                  } else {
                    if (null != le.field_e) {
                      var2 = 0;
                      L5: while (true) {
                        if (us.field_i.length <= var2) {
                          return new byte[param0];
                        } else {
                          if (us.field_i[var2] == param0) {
                            if (uj.field_D[var2] > 0) {
                              uj.field_D[var2] = uj.field_D[var2] - 1;
                              var3 = le.field_e[var2][uj.field_D[var2] - 1];
                              le.field_e[var2][uj.field_D[var2]] = null;
                              return var3;
                            } else {
                              var2++;
                              continue L5;
                            }
                          } else {
                            var2++;
                            continue L5;
                          }
                        }
                      }
                    } else {
                      return new byte[param0];
                    }
                  }
                }
              } else {
                L6: {
                  if (30000 != param0) {
                    break L6;
                  } else {
                    if (-1 <= (ep.field_d ^ -1)) {
                      break L6;
                    } else {
                      fieldTemp$148 = vt.field_d;
                      fieldTemp$149 = ep.field_d - 1;
                      ep.field_d = ep.field_d - 1;
                      var2_ref_byte__ = fieldTemp$148[fieldTemp$149];
                      vt.field_d[ep.field_d] = null;
                      return var2_ref_byte__;
                    }
                  }
                }
                L7: {
                  if (null != le.field_e) {
                    var2 = 0;
                    L8: while (true) {
                      if (us.field_i.length <= var2) {
                        break L7;
                      } else {
                        if (us.field_i[var2] == param0) {
                          if (uj.field_D[var2] > 0) {
                            uj.field_D[var2] = uj.field_D[var2] - 1;
                            var3 = le.field_e[var2][uj.field_D[var2] - 1];
                            le.field_e[var2][uj.field_D[var2]] = null;
                            return var3;
                          } else {
                            var2++;
                            continue L8;
                          }
                        } else {
                          var2++;
                          continue L8;
                        }
                      }
                    }
                  } else {
                    break L7;
                  }
                }
                return new byte[param0];
              }
            }
          }
        } else {
          return (byte[]) null;
        }
    }

    static {
        field_a = new int[8192];
    }
}
