/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends td {
    rd(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((rd) this).field_n = param3;
            ((rd) this).field_k = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("rd.<init>(").append(param0).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int[] a(boolean param0, lu param1) {
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_3_0 = null;
        int[] stackIn_6_0 = null;
        int[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_5_0 = null;
        int[] stackOut_9_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            var2 = new int[50];
            var3 = param1.b(16711935);
            var4 = 0;
            if (param0) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var3 >= ~var4) {
                      break L3;
                    } else {
                      stackOut_5_0 = (int[]) var2;
                      stackIn_10_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        stackIn_6_0[param1.b(16711935)] = param1.b(16711935);
                        var4++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_9_0 = (int[]) var2;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (int[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2_ref;
            stackOut_11_1 = new StringBuilder().append("rd.B(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_10_0;
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        ak var4 = null;
        ak stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        ak stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var3 = ((rd) this).field_h.a(param1 + 63, param0);
              var4 = new ak(((rd) this).field_g, new nq(var3));
              var4.field_r = ((rd) this).field_k;
              var4.field_s = ((rd) this).field_n;
              var4.field_o.a((bw) (Object) new eba(), true);
              if (param1 == 3) {
                break L1;
              } else {
                rd.c((byte) 77);
                break L1;
              }
            }
            stackOut_3_0 = (ak) var4;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("rd.A(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return (ii) (Object) stackIn_4_0;
    }

    final static void c(byte param0) {
        RuntimeException var1 = null;
        pf var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        nea var6 = null;
        String var7 = null;
        nea var7_ref = null;
        String var8 = null;
        int var9 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_50_0 = false;
        int stackIn_60_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        boolean stackOut_49_0 = false;
        int stackOut_58_0 = 0;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            var1_ref = ig.field_m;
            var2 = var1_ref.b(param0 + 16712046);
            if (var2 == 0) {
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
                if (var1_ref.b(param0 + 16712046) != 1) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_11_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var3_int = stackIn_11_0;
                  var4_ref_String = var1_ref.g(83);
                  if (var3_int == 0) {
                    break L4;
                  } else {
                    var5 = var1_ref.g(43);
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
                var7 = var1_ref.g(param0 + 157);
                var8 = fq.a(0, (CharSequence) (Object) var4_ref_String);
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
                    fq.field_s.a((eo) (Object) var6, 91, (long)var8.hashCode());
                    break L6;
                  }
                }
              }
              L7: {
                if (null == var6) {
                  var6 = new nea();
                  fq.field_s.a((eo) (Object) var6, 91, (long)var8.hashCode());
                  int fieldTemp$2 = bda.field_l;
                  bda.field_l = bda.field_l + 1;
                  var6.field_wb = fieldTemp$2;
                  cca.field_v.a((bw) (Object) var6, true);
                  break L7;
                } else {
                  break L7;
                }
              }
              var6.field_xb = var4_ref_String;
              var6.field_Cb = var5;
              var6.field_Ab = var7;
              return;
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
                  var3 = var1_ref.g(79);
                  if (!var3.equals((Object) (Object) "")) {
                    break L9;
                  } else {
                    var3 = null;
                    break L9;
                  }
                }
                L10: {
                  var4_ref_String = var1_ref.g(param0 ^ -40);
                  var5 = var1_ref.g(-94);
                  var6 = bna.b(-51, var4_ref_String);
                  if (var6 != null) {
                    break L10;
                  } else {
                    var6 = bna.b(-102, var5);
                    if (var6 != null) {
                      wja.field_m.a((eo) (Object) var6, 91, (long)fq.a(0, (CharSequence) (Object) var4_ref_String).hashCode());
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
                    wja.field_m.a((eo) (Object) var6, param0 ^ -54, (long)fq.a(0, (CharSequence) (Object) var4_ref_String).hashCode());
                    int fieldTemp$3 = maa.field_v;
                    maa.field_v = maa.field_v + 1;
                    var6.field_wb = fieldTemp$3;
                    es.field_j.a((bw) (Object) var6, true);
                    break L11;
                  }
                }
                L12: {
                  if (null != var3) {
                    var3 = var3.intern();
                    break L12;
                  } else {
                    break L12;
                  }
                }
                var6.field_vb = var3;
                var6.field_Ab = var5;
                var6.field_xb = var4_ref_String;
                var6.a(false);
                var7_ref = (nea) (Object) es.field_j.b((byte) 90);
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
                              var7_ref = (nea) (Object) es.field_j.c(0);
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
                          es.field_j.a((bw) (Object) var6, true);
                          if (var9 == 0) {
                            break L14;
                          } else {
                            break L17;
                          }
                        }
                      }
                      stackOut_58_0 = -74;
                      stackIn_60_0 = stackOut_58_0;
                      break L15;
                    }
                    nr.a((byte) stackIn_60_0, (bw) (Object) var7_ref, (bw) (Object) var6);
                    break L14;
                  }
                  return;
                }
              } else {
                if (var2 != 2) {
                  if (var2 == 3) {
                    L18: {
                      if (um.field_c == 2) {
                        um.field_c = 1;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    return;
                  } else {
                    if (var2 != 4) {
                      cv.a(1, "F1: " + nia.d((byte) -89), (Throwable) null);
                      vc.a((byte) -122);
                      if (param0 == -111) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    } else {
                      um.field_c = 1;
                      var3 = var1_ref.g(52);
                      sja.field_gb = var3.intern();
                      var4 = var1_ref.b(param0 ^ -16711826);
                      em.a(param0 ^ -109, var4);
                      return;
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
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "rd.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
