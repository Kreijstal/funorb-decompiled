/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends td {
    rd(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_n = param3;
            this.field_k = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("rd.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int[] a(boolean param0, lu param1) {
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_3_0 = null;
        int[] stackIn_6_0 = null;
        int[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = new int[50];
                        var3 = param1.b(16711935);
                        var4 = 0;
                        if (param0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = (int[]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        if ((var3 ^ -1) >= (var4 ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_10_0 = (int[]) (var2);
                        stackIn_6_0 = stackIn_10_0;
                        if (var5 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_6_0[param1.b(16711935)] = param1.b(16711935);
                        var4++;
                        if (var5 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_10_0 = (int[]) (var2);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_14_0 = (RuntimeException) (var2_ref);
                    stackIn_12_0 = stackIn_14_0;
                    stackIn_14_1 = new StringBuilder().append("rd.B(").append(param0).append(',');
                    stackIn_12_1 = stackIn_14_1;
                    if (param1 == null) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_15_2 = "{...}";
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_15_2 = "null";
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    throw pe.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        ak var4 = null;
        ak stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = this.field_h.a(param1 + 63, param0);
              var4 = new ak(this.field_g, new nq(var3));
              var4.field_r = this.field_k;
              var4.field_s = this.field_n;
              var4.field_o.a(new eba(), true);
              if (param1 == 3) {
                break L1;
              } else {
                rd.c((byte) 77);
                break L1;
              }
            }
            stackIn_4_0 = (ak) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("rd.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return (ii) ((Object) stackIn_4_0);
    }

    final static void c(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_50_0 = false;
        int stackIn_60_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_49_0;
        pf var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        nea var6 = null;
        String var7 = null;
        nea var7_ref = null;
        String var8 = null;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            var1 = ig.field_m;
            var2 = var1.b(param0 + 16712046);
            if ((var2 ^ -1) == -1) {
              L1: {
                if (fq.field_s != null) {
                  break L1;
                } else {
                  fq.field_s = new wma(128);
                  bda.field_l = 0;
                  break L1;
                }
              }
              L2: {
                if ((var1.b(param0 + 16712046) ^ -1) != -2) {
                  stackIn_11_0 = 0;
                  break L2;
                } else {
                  stackIn_11_0 = 1;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var3_int = stackIn_11_0;
                  var4_ref_String = var1.g(83);
                  if (var3_int == 0) {
                    break L4;
                  } else {
                    var5 = var1.g(43);
                    if (var9 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var5 = var4_ref_String;
                break L3;
              }
              L5: {
                var6 = di.a(var4_ref_String, -118);
                var7 = var1.g(param0 + 157);
                var8 = fq.a(0, (CharSequence) ((Object) var4_ref_String));
                if (var8 == null) {
                  var8 = var4_ref_String;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (null != var6) {
                  break L6;
                } else {
                  var6 = di.a(var7, -124);
                  if (null == var6) {
                    break L6;
                  } else {
                    fq.field_s.a(var6, 91, (long)var8.hashCode());
                    break L6;
                  }
                }
              }
              L7: {
                if (null == var6) {
                  var6 = new nea();
                  fq.field_s.a(var6, 91, (long)var8.hashCode());
                  fieldTemp$0 = bda.field_l;
                  bda.field_l = bda.field_l + 1;
                  var6.field_wb = fieldTemp$0;
                  cca.field_v.a(var6, true);
                  break L7;
                } else {
                  break L7;
                }
              }
              var6.field_xb = var4_ref_String;
              var6.field_Cb = var5;
              var6.field_Ab = var7;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (1 == var2) {
                L8: {
                  if (wja.field_m != null) {
                    break L8;
                  } else {
                    wja.field_m = new wma(128);
                    maa.field_v = 0;
                    break L8;
                  }
                }
                L9: {
                  var3 = var1.g(79);
                  if (!((String) (var3)).equals("")) {
                    break L9;
                  } else {
                    var3 = null;
                    break L9;
                  }
                }
                L10: {
                  var4_ref_String = var1.g(param0 ^ -40);
                  var5 = var1.g(-94);
                  var6 = bna.b(-51, var4_ref_String);
                  if (var6 != null) {
                    break L10;
                  } else {
                    var6 = bna.b(-102, var5);
                    if (var6 != null) {
                      wja.field_m.a(var6, 91, (long)fq.a(0, (CharSequence) ((Object) var4_ref_String)).hashCode());
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
                L11: {
                  if (var6 != null) {
                    break L11;
                  } else {
                    var6 = new nea();
                    wja.field_m.a(var6, param0 ^ -54, (long)fq.a(0, (CharSequence) ((Object) var4_ref_String)).hashCode());
                    fieldTemp$1 = maa.field_v;
                    maa.field_v = maa.field_v + 1;
                    var6.field_wb = fieldTemp$1;
                    es.field_j.a(var6, true);
                    break L11;
                  }
                }
                L12: {
                  if (null != var3) {
                    var3 = ((String) (var3)).intern();
                    break L12;
                  } else {
                    break L12;
                  }
                }
                var6.field_vb = (String) (var3);
                var6.field_Ab = var5;
                var6.field_xb = var4_ref_String;
                var6.a(false);
                var7_ref = (nea) ((Object) es.field_j.b((byte) 90));
                L13: while (true) {
                  L14: {
                    L15: {
                      L16: {
                        if (var7_ref == null) {
                          break L16;
                        } else {
                          stackOut_49_0 = re.a(param0 ^ -29797, var7_ref, var6);
                          stackIn_60_0 = stackOut_49_0 ? 1 : 0;
                          stackIn_50_0 = stackOut_49_0;
                          if (var9 != 0) {
                            break L15;
                          } else {
                            if (!stackIn_50_0) {
                              break L16;
                            } else {
                              var7_ref = (nea) ((Object) es.field_j.c(0));
                              if (var9 == 0) {
                                continue L13;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                      }
                      L17: {
                        if (var7_ref != null) {
                          break L17;
                        } else {
                          es.field_j.a(var6, true);
                          if (var9 == 0) {
                            break L14;
                          } else {
                            break L17;
                          }
                        }
                      }
                      stackIn_60_0 = -74;
                      break L15;
                    }
                    nr.a((byte) stackIn_60_0, var7_ref, var6);
                    break L14;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                if (-3 != (var2 ^ -1)) {
                  if (-4 == (var2 ^ -1)) {
                    L18: {
                      if ((um.field_c ^ -1) == -3) {
                        um.field_c = 1;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if ((var2 ^ -1) != -5) {
                      cv.a(1, "F1: " + nia.d((byte) -89), (Throwable) null);
                      vc.a((byte) -122);
                      if (param0 == -111) {
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      um.field_c = 1;
                      var3 = var1.g(52);
                      sja.field_gb = ((String) (var3)).intern();
                      var4 = var1.b(param0 ^ -16711826);
                      em.a(param0 ^ -109, var4);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  L19: {
                    if (um.field_c != 1) {
                      break L19;
                    } else {
                      um.field_c = 2;
                      break L19;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1_ref), "rd.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    static {
    }
}
