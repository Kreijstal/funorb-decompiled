/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends qm {
    int field_O;
    static boolean field_U;
    int field_T;
    int field_N;
    int field_V;
    static boolean field_P;
    int field_R;
    int field_Q;
    static String field_S;

    final static void a(int param0, java.awt.Canvas param1) {
        L0: {
          if (11 == el.field_b) {
            am.b(98);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -1913) {
          si.a((byte) -51);
          mi.a(go.field_f, bf.field_o, -1, ad.field_r);
          fj.a(0, 0, (byte) 113, param1);
          return;
        } else {
          mi.a(go.field_f, bf.field_o, -1, ad.field_r);
          fj.a(0, 0, (byte) 113, param1);
          return;
        }
    }

    final static double a(double param0, boolean param1) {
        if (param1) {
            return -0.8130049379793588;
        }
        return rl.field_f[(int)(param0 * 32768.0 / 3.141592653589793) & 65535];
    }

    final static void a(int param0, byte[] param1, int param2, int param3, boolean param4, byte param5) {
        pc var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var6 = aa.field_f;
          var6.g(param0, 15514);
          var6.field_m = var6.field_m + 1;
          var7 = var6.field_m;
          var6.e(160, 4);
          var6.e(160, param2);
          var8 = param3;
          if (param4) {
            var8 += 128;
            break L0;
          } else {
            break L0;
          }
        }
        if (param5 != -76) {
          return;
        } else {
          var6.e(160, var8);
          var6.a(param1.length, 0, -3493, param1);
          var6.f(var6.field_m + -var7, param5 + 75);
          return;
        }
    }

    public static void a(byte param0) {
        field_S = null;
        if (param0 == 95) {
            return;
        }
        si.a((byte) 28);
    }

    final boolean a(byte param0, ng param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Pixelate.field_H ? 1 : 0;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          var8 = -param5 - (((si) this).field_z + ((si) this).field_O) + param4;
          var9 = param6 + (-((si) this).field_R + (-param3 - ((si) this).field_p));
          if (var8 * var8 - -(var9 * var9) < ((si) this).field_N * ((si) this).field_N) {
            var10 = Math.atan2((double)var9, (double)var8) - of.field_f;
            if (0.0 <= var10) {
              L0: {
                if (var10 <= 0.0) {
                  break L0;
                } else {
                  var10 = var10 + 3.141592653589793 / (double)((si) this).field_V;
                  break L0;
                }
              }
              ((si) this).field_T = (int)((double)((si) this).field_V * var10 / 6.283185307179586);
              L1: while (true) {
                if (((si) this).field_V <= ((si) this).field_T) {
                  ((si) this).field_T = ((si) this).field_T - ((si) this).field_V;
                  continue L1;
                } else {
                  L2: while (true) {
                    if (0 <= ((si) this).field_T) {
                      return true;
                    } else {
                      ((si) this).field_T = ((si) this).field_T + ((si) this).field_V;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              var10 = var10 - 3.141592653589793 / (double)((si) this).field_V;
              ((si) this).field_T = (int)((double)((si) this).field_V * var10 / 6.283185307179586);
              L3: while (true) {
                if (((si) this).field_V <= ((si) this).field_T) {
                  ((si) this).field_T = ((si) this).field_T - ((si) this).field_V;
                  continue L3;
                } else {
                  L4: while (true) {
                    if (0 <= ((si) this).field_T) {
                      return true;
                    } else {
                      ((si) this).field_T = ((si) this).field_T + ((si) this).field_V;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    private si() throws Throwable {
        throw new Error();
    }

    final static boolean a(int param0, int param1, CharSequence param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        var11 = Pixelate.field_H ? 1 : 0;
        if ((param1 ^ -1) <= -3) {
          if (param1 <= 36) {
            var4 = 0;
            var5 = 0;
            if (param0 == -26629) {
              var6 = 0;
              var7 = param2.length();
              var8 = 0;
              if (var7 > var8) {
                L0: {
                  var9 = param2.charAt(var8);
                  if (var8 != 0) {
                    break L0;
                  } else {
                    if (var9 != 45) {
                      if (43 != var9) {
                        break L0;
                      } else {
                        if (!param3) {
                          break L0;
                        } else {
                          var8++;
                          var8++;
                          var8++;
                          var8++;
                          var8++;
                          return var5 != 0;
                        }
                      }
                    } else {
                      var4 = 1;
                      var8++;
                      var8++;
                      var8++;
                      var8++;
                      var8++;
                      var8++;
                      return var5 != 0;
                    }
                  }
                }
                L1: {
                  L2: {
                    if (var9 < 48) {
                      break L2;
                    } else {
                      if (var9 > 57) {
                        break L2;
                      } else {
                        var9 -= 48;
                        break L1;
                      }
                    }
                  }
                  L3: {
                    if (65 > var9) {
                      break L3;
                    } else {
                      if (var9 > 90) {
                        break L3;
                      } else {
                        var9 -= 55;
                        break L1;
                      }
                    }
                  }
                  L4: {
                    if (97 > var9) {
                      break L4;
                    } else {
                      if (122 < var9) {
                        break L4;
                      } else {
                        var9 -= 87;
                        break L1;
                      }
                    }
                  }
                  return false;
                }
                if (param1 <= var9) {
                  return false;
                } else {
                  L5: {
                    if (var4 != 0) {
                      var9 = -var9;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var10 = param1 * var6 - -var9;
                  if (var10 / param1 != var6) {
                    return false;
                  } else {
                    var6 = var10;
                    var5 = 1;
                    var8++;
                    var8++;
                    var8++;
                    var8++;
                    return var5 != 0;
                  }
                }
              } else {
                return var5 != 0;
              }
            } else {
              var12 = null;
              boolean discarded$1 = si.a(30, 48, (CharSequence) null, false);
              var6 = 0;
              var7 = param2.length();
              var8 = 0;
              L6: while (true) {
                if (var7 > var8) {
                  L7: {
                    var9 = param2.charAt(var8);
                    if (var8 != 0) {
                      break L7;
                    } else {
                      if (var9 != 45) {
                        if (43 != var9) {
                          break L7;
                        } else {
                          if (!param3) {
                            break L7;
                          } else {
                            var8++;
                            continue L6;
                          }
                        }
                      } else {
                        var4 = 1;
                        var8++;
                        continue L6;
                      }
                    }
                  }
                  L8: {
                    L9: {
                      if (var9 < 48) {
                        break L9;
                      } else {
                        if (var9 > 57) {
                          break L9;
                        } else {
                          var9 -= 48;
                          break L8;
                        }
                      }
                    }
                    L10: {
                      if (65 > var9) {
                        break L10;
                      } else {
                        if (var9 > 90) {
                          break L10;
                        } else {
                          var9 -= 55;
                          break L8;
                        }
                      }
                    }
                    L11: {
                      if (97 > var9) {
                        break L11;
                      } else {
                        if (122 < var9) {
                          break L11;
                        } else {
                          var9 -= 87;
                          break L8;
                        }
                      }
                    }
                    return false;
                  }
                  if (param1 <= var9) {
                    return false;
                  } else {
                    L12: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    var10 = param1 * var6 - -var9;
                    if (var10 / param1 == var6) {
                      var6 = var10;
                      var5 = 1;
                      var8++;
                      continue L6;
                    } else {
                      return false;
                    }
                  }
                } else {
                  return var5 != 0;
                }
              }
            }
          } else {
            throw new IllegalArgumentException("" + param1);
          }
        } else {
          throw new IllegalArgumentException("" + param1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = false;
        field_P = true;
        field_S = "Email (Login):";
    }
}
