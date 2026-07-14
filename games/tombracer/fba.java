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
        float[] var3 = null;
        Object var4 = null;
        float[] var5 = null;
        if (param0 != 1) {
          var4 = null;
          float[] discarded$2 = fba.a(60, (float[]) null, -59);
          var5 = new float[param2];
          var3 = var5;
          lua.a(param1, 0, var5, 0, param2);
          return var5;
        } else {
          var5 = new float[param2];
          var3 = var5;
          lua.a(param1, 0, var5, 0, param2);
          return var5;
        }
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if ((param0 ^ -1) != -101) {
          if (param1 == 0) {
            L0: {
              if (5000 != param0) {
                break L0;
              } else {
                if (-1 <= rg.field_B) {
                  break L0;
                } else {
                  rg.field_B = rg.field_B - 1;
                  var2_ref_byte__ = tw.field_f[rg.field_B - 1];
                  tw.field_f[rg.field_B] = null;
                  return var2_ref_byte__;
                }
              }
            }
            if (-30001 != param0) {
              L1: {
                if (null == osa.field_r) {
                  break L1;
                } else {
                  var2 = 0;
                  L2: while (true) {
                    if (cka.field_Mc.length <= var2) {
                      break L1;
                    } else {
                      if (param0 != cka.field_Mc[var2]) {
                        var2++;
                        var2++;
                        continue L2;
                      } else {
                        if ((qea.field_b[var2] ^ -1) < -1) {
                          qea.field_b[var2] = qea.field_b[var2] - 1;
                          var3 = osa.field_r[var2][qea.field_b[var2] - 1];
                          osa.field_r[var2][qea.field_b[var2]] = null;
                          return var3;
                        } else {
                          var2++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
              }
              return new byte[param0];
            } else {
              if (ia.field_a > 0) {
                ia.field_a = ia.field_a - 1;
                var2_ref_byte__ = fb.field_a[ia.field_a - 1];
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
                        if (param0 != cka.field_Mc[var2]) {
                          var2++;
                          var2++;
                          continue L4;
                        } else {
                          if ((qea.field_b[var2] ^ -1) < -1) {
                            qea.field_b[var2] = qea.field_b[var2] - 1;
                            var3 = osa.field_r[var2][qea.field_b[var2] - 1];
                            osa.field_r[var2][qea.field_b[var2]] = null;
                            return var3;
                          } else {
                            var2++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                }
                return new byte[param0];
              }
            }
          } else {
            return null;
          }
        } else {
          if (ika.field_b >= -1) {
            if (param1 == 0) {
              if (5000 == param0) {
                if (-1 <= rg.field_B) {
                  if (-30001 != param0) {
                    if (null != osa.field_r) {
                      var2 = 0;
                      L5: while (true) {
                        if (cka.field_Mc.length > var2) {
                          if (param0 != cka.field_Mc[var2]) {
                            var2++;
                            var2++;
                            continue L5;
                          } else {
                            if ((qea.field_b[var2] ^ -1) < -1) {
                              qea.field_b[var2] = qea.field_b[var2] - 1;
                              var3 = osa.field_r[var2][qea.field_b[var2] - 1];
                              osa.field_r[var2][qea.field_b[var2]] = null;
                              return var3;
                            } else {
                              var2++;
                              continue L5;
                            }
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
                        if (cka.field_Mc.length > var2) {
                          if (param0 == cka.field_Mc[var2]) {
                            if ((qea.field_b[var2] ^ -1) < -1) {
                              qea.field_b[var2] = qea.field_b[var2] - 1;
                              var3 = osa.field_r[var2][qea.field_b[var2] - 1];
                              osa.field_r[var2][qea.field_b[var2]] = null;
                              return var3;
                            } else {
                              var2++;
                              var2++;
                              var2++;
                              return new byte[param0];
                            }
                          } else {
                            var2++;
                            var2++;
                            var2++;
                            return new byte[param0];
                          }
                        } else {
                          return new byte[param0];
                        }
                      } else {
                        return new byte[param0];
                      }
                    } else {
                      ia.field_a = ia.field_a - 1;
                      var2_ref_byte__ = fb.field_a[ia.field_a - 1];
                      fb.field_a[ia.field_a] = null;
                      return var2_ref_byte__;
                    }
                  }
                } else {
                  rg.field_B = rg.field_B - 1;
                  var2_ref_byte__ = tw.field_f[rg.field_B - 1];
                  tw.field_f[rg.field_B] = null;
                  return var2_ref_byte__;
                }
              } else {
                L6: {
                  if (-30001 != param0) {
                    break L6;
                  } else {
                    if (ia.field_a > 0) {
                      ia.field_a = ia.field_a - 1;
                      var2_ref_byte__ = fb.field_a[ia.field_a - 1];
                      fb.field_a[ia.field_a] = null;
                      return var2_ref_byte__;
                    } else {
                      break L6;
                    }
                  }
                }
                if (null != osa.field_r) {
                  var2 = 0;
                  if (cka.field_Mc.length > var2) {
                    if (param0 == cka.field_Mc[var2]) {
                      if ((qea.field_b[var2] ^ -1) < -1) {
                        qea.field_b[var2] = qea.field_b[var2] - 1;
                        var3 = osa.field_r[var2][qea.field_b[var2] - 1];
                        osa.field_r[var2][qea.field_b[var2]] = null;
                        return var3;
                      } else {
                        var2++;
                        var2++;
                        var2++;
                        var2++;
                        return new byte[param0];
                      }
                    } else {
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      return new byte[param0];
                    }
                  } else {
                    return new byte[param0];
                  }
                } else {
                  return new byte[param0];
                }
              }
            } else {
              return null;
            }
          } else {
            ika.field_b = ika.field_b - 1;
            var2_ref_byte__ = eh.field_i[ika.field_b - 1];
            eh.field_i[ika.field_b] = null;
            return var2_ref_byte__;
          }
        }
    }

    static {
    }
}
