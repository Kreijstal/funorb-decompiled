/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class gi {
    static byte[] field_c;
    static uc field_b;
    static String[] field_a;
    static sf field_d;

    final static boolean a(int param0, char param1) {
        if (!Character.isISOControl(param1)) {
          if (ii.a(1, param1)) {
            return true;
          } else {
            L0: {
              if (param1 == (char)param0) {
                break L0;
              } else {
                if (160 == param1) {
                  break L0;
                } else {
                  if (32 == param1) {
                    break L0;
                  } else {
                    if (95 != param1) {
                      return false;
                    } else {
                      return true;
                    }
                  }
                }
              }
            }
            return true;
          }
        } else {
          return false;
        }
    }

    final static boolean a(int param0, boolean param1) {
        try {
            if (ae.field_a.field_i >= param0) {
                return true;
            }
            if (!(null != sg.field_h)) {
                return false;
            }
            if (!param1) {
                field_d = null;
            }
            int var2_int = sg.field_h.e(-114);
            if (var2_int > 0) {
                if (!(var2_int <= param0 + -ae.field_a.field_i)) {
                    var2_int = param0 - ae.field_a.field_i;
                }
                sg.field_h.a(var2_int, ae.field_a.field_k, ae.field_a.field_i, false);
                ug.field_d = lj.a((byte) -128);
                ae.field_a.field_i = ae.field_a.field_i + var2_int;
                if (ae.field_a.field_i < param0) {
                    return false;
                }
                ae.field_a.field_i = 0;
                return true;
            }
            try {
                if (false) throw (IOException) null;
                if (-1 >= (var2_int ^ -1)) {
                    if ((h.b(115) ^ -1L) >= -30001L) {
                        return false;
                    }
                }
                k.c(-28354);
            } catch (IOException iOException) {
                k.c(-28354);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract int a(int param0, byte param1);

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        var14 = fleas.field_A ? 1 : 0;
        if (param5 <= param1) {
          return;
        } else {
          if (param1 - -1 < param2) {
            L0: {
              if (param2 <= 5 + param1) {
                break L0;
              } else {
                if (param6 == param4) {
                  break L0;
                } else {
                  var7 = (1 & (param6 & param4)) + ((param6 >> -1403664127) + (param4 >> -1570190047));
                  var8 = param1;
                  var9 = param4;
                  var10 = param6;
                  var11 = param1;
                  L1: while (true) {
                    if (param2 <= var11) {
                      gi.a(param0, param1, var8, param3, param4, param5, var9);
                      gi.a(param0, var8, param2, -3300, var10, param5, param6);
                      return;
                    } else {
                      L2: {
                        var12 = mh.field_y[var11];
                        if (!param0) {
                          stackOut_21_0 = uj.field_a[var12];
                          stackIn_22_0 = stackOut_21_0;
                          break L2;
                        } else {
                          stackOut_20_0 = jl.field_b[var12];
                          stackIn_22_0 = stackOut_20_0;
                          break L2;
                        }
                      }
                      var13 = stackIn_22_0;
                      if (var7 >= var13) {
                        if (var10 < var13) {
                          var10 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      } else {
                        mh.field_y[var11] = mh.field_y[var8];
                        int incrementValue$1 = var8;
                        var8++;
                        mh.field_y[incrementValue$1] = var12;
                        if (var9 > var13) {
                          var9 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            var7 = param2 - 1;
            L3: while (true) {
              if (param1 >= var7) {
                return;
              } else {
                var8 = param1;
                L4: while (true) {
                  if (var8 >= var7) {
                    var7--;
                    continue L3;
                  } else {
                    var9 = mh.field_y[var8];
                    var10 = mh.field_y[1 + var8];
                    if (ob.a(param0, var9, true, var10)) {
                      mh.field_y[var8] = var10;
                      mh.field_y[1 + var8] = var9;
                      var8++;
                      continue L4;
                    } else {
                      var8++;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final static boolean a(CharSequence param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = fleas.field_A ? 1 : 0;
          if (param3 < 2) {
            break L0;
          } else {
            if (param3 > 36) {
              break L0;
            } else {
              var4 = 0;
              var5 = 0;
              var6 = param2;
              var7 = param0.length();
              var8 = 0;
              L1: while (true) {
                if (var8 >= var7) {
                  return var5 != 0;
                } else {
                  L2: {
                    var9 = param0.charAt(var8);
                    if (var8 == 0) {
                      if (var9 != 45) {
                        if (var9 != 43) {
                          break L2;
                        } else {
                          if (!param1) {
                            break L2;
                          } else {
                            var8++;
                            continue L1;
                          }
                        }
                      } else {
                        var4 = 1;
                        var8++;
                        continue L1;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      if (var9 < 48) {
                        break L4;
                      } else {
                        if (var9 <= 57) {
                          var9 -= 48;
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var9 < 65) {
                        break L5;
                      } else {
                        if (var9 > 90) {
                          break L5;
                        } else {
                          var9 -= 55;
                          break L3;
                        }
                      }
                    }
                    if (var9 < 97) {
                      return false;
                    } else {
                      if (var9 <= 122) {
                        var9 -= 87;
                        break L3;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (var9 >= param3) {
                    return false;
                  } else {
                    L6: {
                      if (var4 == 0) {
                        break L6;
                      } else {
                        var9 = -var9;
                        break L6;
                      }
                    }
                    var10 = param3 * var6 - -var9;
                    if (var10 / param3 == var6) {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L1;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
          }
        }
        throw new IllegalArgumentException("" + param3);
    }

    abstract byte[] b(int param0, boolean param1);

    abstract rf a(int param0);

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        if (param0 < 26) {
            field_b = null;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
