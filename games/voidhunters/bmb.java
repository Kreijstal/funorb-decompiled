/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bmb {
    private gnb field_e;
    static String field_b;
    private asb field_d;
    private asb field_c;
    private gnb field_a;

    private final gd a(byte param0, int param1, int[] param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        gd var8 = null;
        gd var8_ref = null;
        fca var9 = null;
        fca var9_ref = null;
        Object var10 = null;
        var5 = (param3 << -1778192988 & 65522 | param3 >>> 145642476) ^ param1;
        if (param0 > 52) {
          var5 = var5 | param3 << -282543024;
          var6 = (long)var5 ^ 4294967296L;
          var8 = (gd) (Object) ((bmb) this).field_a.a(var6, 103);
          if (var8 != null) {
            return var8;
          } else {
            if (param2 != null) {
              if (0 < param2[0]) {
                L0: {
                  var9 = (fca) (Object) ((bmb) this).field_e.a(var6, 117);
                  if (var9 == null) {
                    var9_ref = fca.a(((bmb) this).field_c, param3, param1);
                    if (var9_ref != null) {
                      ((bmb) this).field_e.a(var6, (ksa) (Object) var9_ref, (byte) -122);
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    break L0;
                  }
                }
                var8_ref = var9_ref.a(param2);
                if (var8_ref == null) {
                  return null;
                } else {
                  var9_ref.b(-3846);
                  ((bmb) this).field_a.a(var6, (ksa) (Object) var8_ref, (byte) -114);
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              L1: {
                var9 = (fca) (Object) ((bmb) this).field_e.a(var6, 117);
                if (var9 == null) {
                  var9_ref = fca.a(((bmb) this).field_c, param3, param1);
                  if (var9_ref != null) {
                    ((bmb) this).field_e.a(var6, (ksa) (Object) var9_ref, (byte) -122);
                    break L1;
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              var8_ref = var9_ref.a(param2);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.b(-3846);
                ((bmb) this).field_a.a(var6, (ksa) (Object) var8_ref, (byte) -114);
                return var8_ref;
              }
            }
          }
        } else {
          var10 = null;
          gd discarded$1 = this.a((String) null, (int[]) null, (byte) -7, (String) null);
          var5 = var5 | param3 << -282543024;
          var6 = (long)var5 ^ 4294967296L;
          var8 = (gd) (Object) ((bmb) this).field_a.a(var6, 103);
          if (var8 != null) {
            return var8;
          } else {
            if (param2 != null) {
              if (0 < param2[0]) {
                L2: {
                  var9 = (fca) (Object) ((bmb) this).field_e.a(var6, 117);
                  if (var9 == null) {
                    var9_ref = fca.a(((bmb) this).field_c, param3, param1);
                    if (var9_ref != null) {
                      ((bmb) this).field_e.a(var6, (ksa) (Object) var9_ref, (byte) -122);
                      break L2;
                    } else {
                      return null;
                    }
                  } else {
                    break L2;
                  }
                }
                var8_ref = var9_ref.a(param2);
                if (var8_ref == null) {
                  return null;
                } else {
                  var9_ref.b(-3846);
                  ((bmb) this).field_a.a(var6, (ksa) (Object) var8_ref, (byte) -114);
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              L3: {
                var9 = (fca) (Object) ((bmb) this).field_e.a(var6, 117);
                if (var9 == null) {
                  var9_ref = fca.a(((bmb) this).field_c, param3, param1);
                  if (var9_ref != null) {
                    ((bmb) this).field_e.a(var6, (ksa) (Object) var9_ref, (byte) -122);
                    break L3;
                  } else {
                    return null;
                  }
                } else {
                  break L3;
                }
              }
              var8_ref = var9_ref.a(param2);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.b(-3846);
                ((bmb) this).field_a.a(var6, (ksa) (Object) var8_ref, (byte) -114);
                return var8_ref;
              }
            }
          }
        }
    }

    private final gd a(String param0, int[] param1, byte param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        if (param2 <= 0) {
          var5 = ((bmb) this).field_c.b(param0, -75);
          if (var5 >= 0) {
            var6 = ((bmb) this).field_c.a(true, var5, param3);
            if (-1 < (var6 ^ -1)) {
              return null;
            } else {
              return this.a((byte) 123, var6, param1, var5);
            }
          } else {
            return null;
          }
        } else {
          var7 = null;
          gd discarded$2 = this.a(-78, (byte) 66, -88, (int[]) null);
          var5 = ((bmb) this).field_c.b(param0, -75);
          if (var5 >= 0) {
            var6 = ((bmb) this).field_c.a(true, var5, param3);
            if (-1 < (var6 ^ -1)) {
              return null;
            } else {
              return this.a((byte) 123, var6, param1, var5);
            }
          } else {
            return null;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, eab param4, long param5, String param6, boolean param7, int param8, int param9, boolean param10, int param11, int param12, int param13) {
        try {
            IOException var15 = null;
            int stackIn_3_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            L0: {
              qga.field_b = new faa(param13);
              dpa.field_p = new faa(param0);
              bia.field_d = param1;
              ff.field_p = param6;
              cp.field_n = param4;
              lmb.field_b = param11;
              if (!param10) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L0;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L0;
              }
            }
            L1: {
              js.field_q = stackIn_3_0 != 0;
              pcb.field_p = param8;
              rda.field_o = param5;
              fk.field_c = param9;
              apa.field_p = param12;
              beb.field_a = param3;
              if (param2 >= 46) {
                break L1;
              } else {
                bmb.a((byte) -11);
                break L1;
              }
            }
            bua.field_o = param7;
            if (null == cp.field_n.field_o) {
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            } else {
              try {
                vsa.field_r = new gdb(cp.field_n.field_o, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final gd a(int param0, byte param1, int param2, int[] param3) {
        int var5 = 0;
        long var6 = 0L;
        gd var8 = null;
        gd var8_ref = null;
        int var10 = 0;
        ab var12 = null;
        gd var13 = null;
        ab var14 = null;
        gd var15 = null;
        var5 = (param0 << -977776188 & 65530 | param0 >>> -162572084) ^ param2;
        var5 = var5 | param0 << -1849872400;
        var6 = (long)var5;
        var8 = (gd) (Object) ((bmb) this).field_a.a(var6, 103);
        if (var8 != null) {
          return var8;
        } else {
          if (param3 != null) {
            if (param3[0] > 0) {
              var14 = ab.a(((bmb) this).field_d, param0, param2);
              if (var14 != null) {
                var15 = var14.b();
                var8_ref = var15;
                ((bmb) this).field_a.a(var6, (ksa) (Object) var8_ref, (byte) -113);
                if (param3 != null) {
                  param3[0] = param3[0] - var15.field_i.length;
                  var10 = 3 / ((param1 - 67) / 51);
                  return var8_ref;
                } else {
                  var10 = 3 / ((param1 - 67) / 51);
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            var12 = ab.a(((bmb) this).field_d, param0, param2);
            if (var12 != null) {
              var13 = var12.b();
              var8_ref = var13;
              ((bmb) this).field_a.a(var6, (ksa) (Object) var8_ref, (byte) -113);
              if (param3 != null) {
                param3[0] = param3[0] - var13.field_i.length;
                var10 = 3 / ((param1 - 67) / 51);
                return var8_ref;
              } else {
                var10 = 3 / ((param1 - 67) / 51);
                return var8_ref;
              }
            } else {
              return null;
            }
          }
        }
    }

    final gd a(String param0, String param1, byte param2) {
        Object var5 = null;
        if (param2 <= 48) {
          var5 = null;
          gd discarded$2 = ((bmb) this).a((String) null, (String) null, (byte) 100);
          return this.a(param0, (int[]) null, (byte) -56, param1);
        } else {
          return this.a(param0, (int[]) null, (byte) -56, param1);
        }
    }

    final gd a(byte param0, int param1, int[] param2) {
        Object var5 = null;
        if ((((bmb) this).field_c.c((byte) 95) ^ -1) == -2) {
          return this.a((byte) 101, param1, param2, 0);
        } else {
          if (-2 == (((bmb) this).field_c.b(param1, param0 + -7069) ^ -1)) {
            return this.a((byte) 112, 0, param2, param1);
          } else {
            if (param0 != 127) {
              var5 = null;
              gd discarded$2 = this.a((byte) -33, -89, (int[]) null, -16);
              throw new RuntimeException();
            } else {
              throw new RuntimeException();
            }
          }
        }
    }

    final gd a(byte param0, int[] param1, int param2) {
        if (-2 == (((bmb) this).field_d.c((byte) 68) ^ -1)) {
            return this.a(0, (byte) -68, param2, param1);
        }
        if (param0 != -16) {
            field_b = null;
            if (!((((bmb) this).field_d.b(param2, param0 ^ 6930) ^ -1) != -2)) {
                return this.a(param2, (byte) -93, 0, param1);
            }
            throw new RuntimeException();
        }
        if (!((((bmb) this).field_d.b(param2, param0 ^ 6930) ^ -1) != -2)) {
            return this.a(param2, (byte) -93, 0, param1);
        }
        throw new RuntimeException();
    }

    public static void a(byte param0) {
        int var1 = -76 / ((37 - param0) / 55);
        field_b = null;
    }

    bmb(asb param0, asb param1) {
        ((bmb) this).field_e = new gnb(256);
        ((bmb) this).field_a = new gnb(256);
        ((bmb) this).field_d = param0;
        ((bmb) this).field_c = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Resizable";
    }
}
