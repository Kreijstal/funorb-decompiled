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
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("un.B(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
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
        byte[][] fieldTemp$2 = null;
        int fieldTemp$3 = 0;
        int dupTemp$4 = 0;
        byte[][] arrayValue$5 = null;
        int fieldTemp$6 = 0;
        byte[][] fieldTemp$7 = null;
        int fieldTemp$8 = 0;
        int dupTemp$9 = 0;
        byte[][] arrayValue$10 = null;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int dupTemp$13 = 0;
        byte[][] arrayValue$14 = null;
        byte[][] fieldTemp$15 = null;
        int fieldTemp$16 = 0;
        int dupTemp$17 = 0;
        byte[][] arrayValue$18 = null;
        byte[][] fieldTemp$19 = null;
        int fieldTemp$20 = 0;
        int dupTemp$21 = 0;
        byte[][] arrayValue$22 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
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
                    fieldTemp$2 = vt.field_d;
                    fieldTemp$3 = ep.field_d - 1;
                    ep.field_d = ep.field_d - 1;
                    var2_ref_byte__ = fieldTemp$2[fieldTemp$3];
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
                        dupTemp$4 = uj.field_D[var2] - 1;
                        arrayValue$5 = le.field_e[var2];
                        uj.field_D[var2] = dupTemp$4;
                        var3 = arrayValue$5[dupTemp$4];
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
                fieldTemp$6 = fu.field_h - 1;
                fu.field_h = fu.field_h - 1;
                var2_ref_byte__ = sg.field_b[fieldTemp$6];
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
                      fieldTemp$7 = vt.field_d;
                      fieldTemp$8 = ep.field_d - 1;
                      ep.field_d = ep.field_d - 1;
                      var2_ref_byte__ = fieldTemp$7[fieldTemp$8];
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
                          dupTemp$9 = uj.field_D[var2] - 1;
                          arrayValue$10 = le.field_e[var2];
                          uj.field_D[var2] = dupTemp$9;
                          var3 = arrayValue$10[dupTemp$9];
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
              fieldTemp$11 = li.field_h - 1;
              li.field_h = li.field_h - 1;
              var2_ref_byte__ = vb.field_g[fieldTemp$11];
              vb.field_g[li.field_h] = null;
              return var2_ref_byte__;
            } else {
              if (param0 == 5000) {
                if ((fu.field_h ^ -1) < -1) {
                  fieldTemp$12 = fu.field_h - 1;
                  fu.field_h = fu.field_h - 1;
                  var2_ref_byte__ = sg.field_b[fieldTemp$12];
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
                                dupTemp$13 = uj.field_D[var2] - 1;
                                arrayValue$14 = le.field_e[var2];
                                uj.field_D[var2] = dupTemp$13;
                                var3 = arrayValue$14[dupTemp$13];
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
                      fieldTemp$15 = vt.field_d;
                      fieldTemp$16 = ep.field_d - 1;
                      ep.field_d = ep.field_d - 1;
                      var2_ref_byte__ = fieldTemp$15[fieldTemp$16];
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
                              dupTemp$17 = uj.field_D[var2] - 1;
                              arrayValue$18 = le.field_e[var2];
                              uj.field_D[var2] = dupTemp$17;
                              var3 = arrayValue$18[dupTemp$17];
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
                      fieldTemp$19 = vt.field_d;
                      fieldTemp$20 = ep.field_d - 1;
                      ep.field_d = ep.field_d - 1;
                      var2_ref_byte__ = fieldTemp$19[fieldTemp$20];
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
                            dupTemp$21 = uj.field_D[var2] - 1;
                            arrayValue$22 = le.field_e[var2];
                            uj.field_D[var2] = dupTemp$21;
                            var3 = arrayValue$22[dupTemp$21];
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
