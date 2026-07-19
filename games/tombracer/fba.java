/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fba {
    static float field_a;

    final static int[] a(int param0, float param1, int param2, boolean param3, int param4, int param5, int param6, int param7) {
        int[] var10 = new int[param6];
        int[] var8 = var10;
        lva var9 = new lva();
        var9.field_z = param7;
        var9.field_u = param2;
        var9.field_n = param4;
        var9.field_w = param0;
        var9.field_s = param3 ? true : false;
        var9.field_x = (int)(4096.0f * param1);
        var9.b((byte) 116);
        uta.a(0, param5, param6);
        var9.a(var10, -1, 0);
        return var10;
    }

    final static float[] a(int param0, float[] param1, int param2) {
        float[] discarded$2 = null;
        float[] var3 = null;
        RuntimeException var3_ref = null;
        float[] var4 = null;
        float[] var5 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        float[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                var4 = (float[]) null;
                discarded$2 = fba.a(60, (float[]) null, -59);
                break L1;
              }
            }
            var5 = new float[param2];
            var3 = var5;
            lua.a(param1, 0, var5, 0, param2);
            stackOut_2_0 = (float[]) (var5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("fba.B(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$63 = 0;
        byte[][] fieldTemp$64 = null;
        int fieldTemp$65 = 0;
        byte[][] fieldTemp$66 = null;
        int fieldTemp$67 = 0;
        int fieldTemp$68 = 0;
        byte[][] fieldTemp$69 = null;
        int fieldTemp$70 = 0;
        int fieldTemp$71 = 0;
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if ((param0 ^ -1) != -101) {
          if (param1 == 0) {
            L0: {
              if (5000 != param0) {
                break L0;
              } else {
                if (-1 <= (rg.field_B ^ -1)) {
                  break L0;
                } else {
                  fieldTemp$63 = rg.field_B - 1;
                  rg.field_B = rg.field_B - 1;
                  var2_ref_byte__ = tw.field_f[fieldTemp$63];
                  tw.field_f[rg.field_B] = null;
                  return var2_ref_byte__;
                }
              }
            }
            if (-30001 != (param0 ^ -1)) {
              L1: {
                if (null == osa.field_r) {
                  break L1;
                } else {
                  var2 = 0;
                  L2: while (true) {
                    if (cka.field_Mc.length <= var2) {
                      break L1;
                    } else {
                      if (param0 == cka.field_Mc[var2]) {
                        if ((qea.field_b[var2] ^ -1) < -1) {
                          qea.field_b[var2] = qea.field_b[var2] - 1;
                          var3 = osa.field_r[var2][qea.field_b[var2] - 1];
                          osa.field_r[var2][qea.field_b[var2]] = null;
                          return var3;
                        } else {
                          var2++;
                          continue L2;
                        }
                      } else {
                        var2++;
                        continue L2;
                      }
                    }
                  }
                }
              }
              return new byte[param0];
            } else {
              if (ia.field_a > 0) {
                fieldTemp$64 = fb.field_a;
                fieldTemp$65 = ia.field_a - 1;
                ia.field_a = ia.field_a - 1;
                var2_ref_byte__ = fieldTemp$64[fieldTemp$65];
                fb.field_a[ia.field_a] = null;
                return var2_ref_byte__;
              } else {
                L3: {
                  if (null == osa.field_r) {
                    break L3;
                  } else {
                    var2 = 0;
                    L4: while (true) {
                      if (cka.field_Mc.length <= var2) {
                        break L3;
                      } else {
                        if (param0 == cka.field_Mc[var2]) {
                          if ((qea.field_b[var2] ^ -1) < -1) {
                            qea.field_b[var2] = qea.field_b[var2] - 1;
                            var3 = osa.field_r[var2][qea.field_b[var2] - 1];
                            osa.field_r[var2][qea.field_b[var2]] = null;
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
                  }
                }
                return new byte[param0];
              }
            }
          } else {
            return (byte[]) null;
          }
        } else {
          if ((ika.field_b ^ -1) >= -1) {
            if (param1 == 0) {
              if (5000 == param0) {
                if (-1 <= (rg.field_B ^ -1)) {
                  if (-30001 != (param0 ^ -1)) {
                    if (null != osa.field_r) {
                      var2 = 0;
                      L5: while (true) {
                        if (cka.field_Mc.length > var2) {
                          if (param0 == cka.field_Mc[var2]) {
                            if ((qea.field_b[var2] ^ -1) < -1) {
                              qea.field_b[var2] = qea.field_b[var2] - 1;
                              var3 = osa.field_r[var2][qea.field_b[var2] - 1];
                              osa.field_r[var2][qea.field_b[var2]] = null;
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
                          return new byte[param0];
                        }
                      }
                    } else {
                      return new byte[param0];
                    }
                  } else {
                    if (ia.field_a <= 0) {
                      if (null != osa.field_r) {
                        var2 = 0;
                        L6: while (true) {
                          if (cka.field_Mc.length > var2) {
                            if (param0 == cka.field_Mc[var2]) {
                              if ((qea.field_b[var2] ^ -1) < -1) {
                                qea.field_b[var2] = qea.field_b[var2] - 1;
                                var3 = osa.field_r[var2][qea.field_b[var2] - 1];
                                osa.field_r[var2][qea.field_b[var2]] = null;
                                return var3;
                              } else {
                                var2++;
                                continue L6;
                              }
                            } else {
                              var2++;
                              continue L6;
                            }
                          } else {
                            return new byte[param0];
                          }
                        }
                      } else {
                        return new byte[param0];
                      }
                    } else {
                      fieldTemp$66 = fb.field_a;
                      fieldTemp$67 = ia.field_a - 1;
                      ia.field_a = ia.field_a - 1;
                      var2_ref_byte__ = fieldTemp$66[fieldTemp$67];
                      fb.field_a[ia.field_a] = null;
                      return var2_ref_byte__;
                    }
                  }
                } else {
                  fieldTemp$68 = rg.field_B - 1;
                  rg.field_B = rg.field_B - 1;
                  var2_ref_byte__ = tw.field_f[fieldTemp$68];
                  tw.field_f[rg.field_B] = null;
                  return var2_ref_byte__;
                }
              } else {
                L7: {
                  if (-30001 != (param0 ^ -1)) {
                    break L7;
                  } else {
                    if (ia.field_a > 0) {
                      fieldTemp$69 = fb.field_a;
                      fieldTemp$70 = ia.field_a - 1;
                      ia.field_a = ia.field_a - 1;
                      var2_ref_byte__ = fieldTemp$69[fieldTemp$70];
                      fb.field_a[ia.field_a] = null;
                      return var2_ref_byte__;
                    } else {
                      break L7;
                    }
                  }
                }
                if (null != osa.field_r) {
                  var2 = 0;
                  L8: while (true) {
                    if (cka.field_Mc.length > var2) {
                      if (param0 == cka.field_Mc[var2]) {
                        if ((qea.field_b[var2] ^ -1) < -1) {
                          qea.field_b[var2] = qea.field_b[var2] - 1;
                          var3 = osa.field_r[var2][qea.field_b[var2] - 1];
                          osa.field_r[var2][qea.field_b[var2]] = null;
                          return var3;
                        } else {
                          var2++;
                          continue L8;
                        }
                      } else {
                        var2++;
                        continue L8;
                      }
                    } else {
                      return new byte[param0];
                    }
                  }
                } else {
                  return new byte[param0];
                }
              }
            } else {
              return (byte[]) null;
            }
          } else {
            fieldTemp$71 = ika.field_b - 1;
            ika.field_b = ika.field_b - 1;
            var2_ref_byte__ = eh.field_i[fieldTemp$71];
            eh.field_i[ika.field_b] = null;
            return var2_ref_byte__;
          }
        }
    }

    static {
    }
}
