/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static vn field_a;
    static int field_b;
    static String field_c;

    public static void a(int param0) {
        boolean discarded$2 = false;
        CharSequence var2 = null;
        field_c = null;
        if (param0 != 1426) {
          var2 = (CharSequence) null;
          discarded$2 = ch.a((CharSequence) null, false, -68);
          field_a = null;
          return;
        } else {
          field_a = null;
          return;
        }
    }

    final static void b(int param0) {
        if (param0 <= 5) {
            return;
        }
        wj var2 = (wj) null;
        ph.a((byte) 62, (wj) null);
    }

    final static void a(byte param0) {
        boolean discarded$0 = false;
        ac.field_m = 1426;
        if (param0 != 80) {
            CharSequence var2 = (CharSequence) null;
            discarded$0 = ch.a((CharSequence) null, false, 20);
        }
    }

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$82 = 0;
        int fieldTemp$83 = 0;
        byte[][] fieldTemp$84 = null;
        int fieldTemp$85 = 0;
        byte[][] fieldTemp$86 = null;
        int fieldTemp$87 = 0;
        int fieldTemp$88 = 0;
        int fieldTemp$89 = 0;
        byte[][] fieldTemp$90 = null;
        int fieldTemp$91 = 0;
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if (100 == param1) {
          if ((qg.field_c ^ -1) >= -1) {
            if (param0 == -5827) {
              if ((param1 ^ -1) != -5001) {
                if (-30001 != (param1 ^ -1)) {
                  if (wg.field_j != null) {
                    var2 = 0;
                    L0: while (true) {
                      if (fl.field_d.length <= var2) {
                        return new byte[param1];
                      } else {
                        if (param1 == fl.field_d[var2]) {
                          if ((ba.field_w[var2] ^ -1) < -1) {
                            ba.field_w[var2] = ba.field_w[var2] - 1;
                            var3 = wg.field_j[var2][ba.field_w[var2] - 1];
                            wg.field_j[var2][ba.field_w[var2]] = null;
                            return var3;
                          } else {
                            var2++;
                            continue L0;
                          }
                        } else {
                          var2++;
                          continue L0;
                        }
                      }
                    }
                  } else {
                    return new byte[param1];
                  }
                } else {
                  if ((kn.field_F ^ -1) >= -1) {
                    if (wg.field_j != null) {
                      var2 = 0;
                      L1: while (true) {
                        if (fl.field_d.length <= var2) {
                          return new byte[param1];
                        } else {
                          if (param1 == fl.field_d[var2]) {
                            if ((ba.field_w[var2] ^ -1) < -1) {
                              ba.field_w[var2] = ba.field_w[var2] - 1;
                              var3 = wg.field_j[var2][ba.field_w[var2] - 1];
                              wg.field_j[var2][ba.field_w[var2]] = null;
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
                      return new byte[param1];
                    }
                  } else {
                    fieldTemp$82 = kn.field_F - 1;
                    kn.field_F = kn.field_F - 1;
                    var2_ref_byte__ = sh.field_j[fieldTemp$82];
                    sh.field_j[kn.field_F] = null;
                    return var2_ref_byte__;
                  }
                }
              } else {
                if (re.field_e <= 0) {
                  if (-30001 != (param1 ^ -1)) {
                    if (wg.field_j != null) {
                      var2 = 0;
                      L2: while (true) {
                        if (fl.field_d.length > var2) {
                          if (param1 == fl.field_d[var2]) {
                            if ((ba.field_w[var2] ^ -1) < -1) {
                              ba.field_w[var2] = ba.field_w[var2] - 1;
                              var3 = wg.field_j[var2][ba.field_w[var2] - 1];
                              wg.field_j[var2][ba.field_w[var2]] = null;
                              return var3;
                            } else {
                              var2++;
                              continue L2;
                            }
                          } else {
                            var2++;
                            continue L2;
                          }
                        } else {
                          return new byte[param1];
                        }
                      }
                    } else {
                      return new byte[param1];
                    }
                  } else {
                    if ((kn.field_F ^ -1) >= -1) {
                      if (wg.field_j != null) {
                        var2 = 0;
                        L3: while (true) {
                          if (fl.field_d.length > var2) {
                            if (param1 == fl.field_d[var2]) {
                              if ((ba.field_w[var2] ^ -1) < -1) {
                                ba.field_w[var2] = ba.field_w[var2] - 1;
                                var3 = wg.field_j[var2][ba.field_w[var2] - 1];
                                wg.field_j[var2][ba.field_w[var2]] = null;
                                return var3;
                              } else {
                                var2++;
                                continue L3;
                              }
                            } else {
                              var2++;
                              continue L3;
                            }
                          } else {
                            return new byte[param1];
                          }
                        }
                      } else {
                        return new byte[param1];
                      }
                    } else {
                      fieldTemp$83 = kn.field_F - 1;
                      kn.field_F = kn.field_F - 1;
                      var2_ref_byte__ = sh.field_j[fieldTemp$83];
                      sh.field_j[kn.field_F] = null;
                      return var2_ref_byte__;
                    }
                  }
                } else {
                  fieldTemp$84 = ka.field_e;
                  fieldTemp$85 = re.field_e - 1;
                  re.field_e = re.field_e - 1;
                  var2_ref_byte__ = fieldTemp$84[fieldTemp$85];
                  ka.field_e[re.field_e] = null;
                  return var2_ref_byte__;
                }
              }
            } else {
              return (byte[]) null;
            }
          } else {
            fieldTemp$86 = ff.field_c;
            fieldTemp$87 = qg.field_c - 1;
            qg.field_c = qg.field_c - 1;
            var2_ref_byte__ = fieldTemp$86[fieldTemp$87];
            ff.field_c[qg.field_c] = null;
            return var2_ref_byte__;
          }
        } else {
          if (param0 == -5827) {
            if ((param1 ^ -1) != -5001) {
              if (-30001 != (param1 ^ -1)) {
                if (wg.field_j != null) {
                  var2 = 0;
                  L4: while (true) {
                    if (fl.field_d.length > var2) {
                      if (param1 == fl.field_d[var2]) {
                        if ((ba.field_w[var2] ^ -1) < -1) {
                          ba.field_w[var2] = ba.field_w[var2] - 1;
                          var3 = wg.field_j[var2][ba.field_w[var2] - 1];
                          wg.field_j[var2][ba.field_w[var2]] = null;
                          return var3;
                        } else {
                          var2++;
                          continue L4;
                        }
                      } else {
                        var2++;
                        continue L4;
                      }
                    } else {
                      return new byte[param1];
                    }
                  }
                } else {
                  return new byte[param1];
                }
              } else {
                if ((kn.field_F ^ -1) >= -1) {
                  if (wg.field_j != null) {
                    var2 = 0;
                    L5: while (true) {
                      if (fl.field_d.length > var2) {
                        if (param1 == fl.field_d[var2]) {
                          if ((ba.field_w[var2] ^ -1) < -1) {
                            ba.field_w[var2] = ba.field_w[var2] - 1;
                            var3 = wg.field_j[var2][ba.field_w[var2] - 1];
                            wg.field_j[var2][ba.field_w[var2]] = null;
                            return var3;
                          } else {
                            var2++;
                            continue L5;
                          }
                        } else {
                          var2++;
                          continue L5;
                        }
                      } else {
                        return new byte[param1];
                      }
                    }
                  } else {
                    return new byte[param1];
                  }
                } else {
                  fieldTemp$88 = kn.field_F - 1;
                  kn.field_F = kn.field_F - 1;
                  var2_ref_byte__ = sh.field_j[fieldTemp$88];
                  sh.field_j[kn.field_F] = null;
                  return var2_ref_byte__;
                }
              }
            } else {
              if (re.field_e <= 0) {
                L6: {
                  if (-30001 != (param1 ^ -1)) {
                    break L6;
                  } else {
                    if ((kn.field_F ^ -1) < -1) {
                      fieldTemp$89 = kn.field_F - 1;
                      kn.field_F = kn.field_F - 1;
                      var2_ref_byte__ = sh.field_j[fieldTemp$89];
                      sh.field_j[kn.field_F] = null;
                      return var2_ref_byte__;
                    } else {
                      break L6;
                    }
                  }
                }
                if (wg.field_j != null) {
                  var2 = 0;
                  L7: while (true) {
                    if (fl.field_d.length > var2) {
                      if (param1 == fl.field_d[var2]) {
                        if ((ba.field_w[var2] ^ -1) < -1) {
                          ba.field_w[var2] = ba.field_w[var2] - 1;
                          var3 = wg.field_j[var2][ba.field_w[var2] - 1];
                          wg.field_j[var2][ba.field_w[var2]] = null;
                          return var3;
                        } else {
                          var2++;
                          continue L7;
                        }
                      } else {
                        var2++;
                        continue L7;
                      }
                    } else {
                      return new byte[param1];
                    }
                  }
                } else {
                  return new byte[param1];
                }
              } else {
                fieldTemp$90 = ka.field_e;
                fieldTemp$91 = re.field_e - 1;
                re.field_e = re.field_e - 1;
                var2_ref_byte__ = fieldTemp$90[fieldTemp$91];
                ka.field_e[re.field_e] = null;
                return var2_ref_byte__;
              }
            }
          } else {
            return (byte[]) null;
          }
        }
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            if (!vb.a(param2, param0, param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = 0;
              L1: while (true) {
                if (param0.length() <= var3_int) {
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!jb.a((byte) 27, param0.charAt(var3_int))) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3_int++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("ch.B(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    static {
        field_c = "You don't seem to have completed all of the Mall and Power Plant levels yet. We recommend you do so before attempting the UK levels.";
    }
}
