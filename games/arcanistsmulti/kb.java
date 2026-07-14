/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kb {
    static String[] field_c;
    private RandomAccessFile field_d;
    static String field_e;
    private long field_b;
    private long field_a;

    final void c(int param0) throws IOException {
        int var2 = -83 % ((param0 - 52) / 34);
        if (!(((kb) this).field_d == null)) {
            ((kb) this).field_d.close();
            ((kb) this).field_d = null;
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int var10 = 0;
        int var11 = 0;
        int var12 = ArcanistsMulti.field_G ? 1 : 0;
        int[] var13 = new int[256];
        int[] var3 = var13;
        int var4 = (param1 & 16736682) >> -1596630640;
        int var5 = (param1 & param2) >> -1726363672;
        int var6 = 255 & param1;
        int var7 = param0 >> -2038476944 & 255;
        int var8 = (65494 & param0) >> -865644600;
        int var9 = param0 & 255;
        for (var10 = 0; 256 > var10; var10++) {
            var11 = 256 + -var10;
            var13[var10] = (var9 * var11 >> -113553400) + ((var6 * var10 >> 1319306760) + ((var10 * var4 >> -1636911448) - -(var11 * var7 >> -1396987544) << 2102339344) + ((var8 * var11 >> 1086348712) + (var10 * var5 >> 937370888) << 548600776));
        }
        return var3;
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (oj.field_i) {
          if (param2 == -32507) {
            L0: {
              co.field_f.b(param0, (byte) 75);
              var4 = nn.field_q.f((byte) 93) ? 1 : 0;
              if (-1 == (re.field_r ^ -1)) {
                break L0;
              } else {
                if (var4 != 0) {
                  break L0;
                } else {
                  param0 = false;
                  uc.c(3);
                  break L0;
                }
              }
            }
            if (!param0) {
              if (var4 == 0) {
                var5 = nn.field_q.f(0) + nn.field_q.field_V;
                if ((var5 ^ -1) >= -641) {
                  if ((var5 ^ -1) > -636) {
                    if (ng.field_K > 0) {
                      ng.field_K = ng.field_K - 5;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  ng.field_K = ng.field_K + 5;
                  return;
                }
              } else {
                co.field_f.b(param0, (byte) 66);
                var5 = nn.field_q.f(0) + nn.field_q.field_V;
                if ((var5 ^ -1) >= -641) {
                  if ((var5 ^ -1) > -636) {
                    if (ng.field_K <= 0) {
                      return;
                    } else {
                      ng.field_K = ng.field_K - 5;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  ng.field_K = ng.field_K + 5;
                  return;
                }
              }
            } else {
              nn.field_q.a(param1, -10284, param3);
              if (var4 != 0) {
                co.field_f.b(param0, (byte) 66);
                var5 = nn.field_q.f(0) + nn.field_q.field_V;
                if ((var5 ^ -1) >= -641) {
                  if ((var5 ^ -1) > -636) {
                    if (ng.field_K <= 0) {
                      return;
                    } else {
                      ng.field_K = ng.field_K - 5;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  ng.field_K = ng.field_K + 5;
                  return;
                }
              } else {
                var5 = nn.field_q.f(0) + nn.field_q.field_V;
                if ((var5 ^ -1) >= -641) {
                  if ((var5 ^ -1) > -636) {
                    if (ng.field_K <= 0) {
                      return;
                    } else {
                      ng.field_K = ng.field_K - 5;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  ng.field_K = ng.field_K + 5;
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final int a(byte[] param0, boolean param1, int param2, int param3) throws IOException {
        int var5 = 0;
        if (!param1) {
          var5 = ((kb) this).field_d.read(param0, param3, param2);
          if (0 < var5) {
            ((kb) this).field_a = ((kb) this).field_a + (long)var5;
            return var5;
          } else {
            return var5;
          }
        } else {
          return -50;
        }
    }

    final long a(int param0) throws IOException {
        if (param0 != -2775) {
            kb.a(true, 53, -119, -107);
            return ((kb) this).field_d.length();
        }
        return ((kb) this).field_d.length();
    }

    final void a(byte param0, long param1) throws IOException {
        ((kb) this).field_d.seek(param1);
        if (param0 != -123) {
          ((kb) this).field_d = null;
          ((kb) this).field_a = param1;
          return;
        } else {
          ((kb) this).field_a = param1;
          return;
        }
    }

    protected final void finalize() throws Throwable {
        if (((kb) this).field_d != null) {
            System.out.println("");
            ((kb) this).c(87);
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        if (param0 != 1) {
            int[] discarded$10 = kb.a(86, -91, -113);
            if (!(((kb) this).field_b >= ((kb) this).field_a + (long)param2)) {
                ((kb) this).field_d.seek(((kb) this).field_b);
                ((kb) this).field_d.write(1);
                throw new EOFException();
            }
            ((kb) this).field_d.write(param3, param1, param2);
            ((kb) this).field_a = ((kb) this).field_a + (long)param2;
            return;
        }
        if (!(((kb) this).field_b >= ((kb) this).field_a + (long)param2)) {
            ((kb) this).field_d.seek(((kb) this).field_b);
            ((kb) this).field_d.write(1);
            throw new EOFException();
        }
        ((kb) this).field_d.write(param3, param1, param2);
        ((kb) this).field_a = ((kb) this).field_a + (long)param2;
    }

    kb(File param0, String param1, long param2) throws IOException {
        if (-1L == param2) {
            param2 = 9223372036854775807L;
        }
        if (param0.length() > param2) {
            boolean discarded$0 = param0.delete();
        }
        ((kb) this).field_d = new RandomAccessFile(param0, param1);
        ((kb) this).field_b = param2;
        ((kb) this).field_a = 0L;
        int var5 = ((kb) this).field_d.read();
        if (-1 != var5) {
            // ifne L106
            ((kb) this).field_d.seek(0L);
            ((kb) this).field_d.write(var5);
        } else {
            ((kb) this).field_d.seek(0L);
            ((kb) this).field_d.seek(0L);
        }
        ((kb) this).field_d.seek(0L);
    }

    final static void b(int param0) {
        ee.a(17, (byte) 30);
        if (param0 != 28579) {
            field_e = null;
        }
    }

    public static void d(int param0) {
        field_c = null;
        field_e = null;
        if (param0 != 255) {
            field_e = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_e = "<%0> has entered a game.";
    }
}
