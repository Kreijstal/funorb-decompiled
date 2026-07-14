/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pa {
    static uj field_b;
    private long field_f;
    static String field_e;
    static String field_a;
    private RandomAccessFile field_d;
    private long field_c;
    static int field_g;

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        if (((pa) this).field_f < (long)param3 - -((pa) this).field_c) {
            ((pa) this).field_d.seek(((pa) this).field_f);
            ((pa) this).field_d.write(1);
            throw new EOFException();
        }
        if (param2 != 90) {
            pa.b((byte) 102);
        }
        ((pa) this).field_d.write(param0, param1, param3);
        ((pa) this).field_c = ((pa) this).field_c + (long)param3;
    }

    final int a(int param0, byte[] param1, int param2, boolean param3) throws IOException {
        int var5 = ((pa) this).field_d.read(param1, param2, param0);
        if ((var5 ^ -1) < -1) {
            ((pa) this).field_c = ((pa) this).field_c + (long)var5;
        }
        if (param3) {
            field_g = -101;
        }
        return var5;
    }

    final long a(int param0) throws IOException {
        if (param0 != 1) {
            return -83L;
        }
        return ((pa) this).field_d.length();
    }

    public static void b(byte param0) {
        field_e = null;
        if (param0 <= 3) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static boolean a(CharSequence param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (2 > param2) {
            break L0;
          } else {
            if ((param2 ^ -1) < -37) {
              break L0;
            } else {
              L1: {
                var4 = 0;
                var5 = 0;
                var6 = 0;
                var7 = param0.length();
                if (param3 == 87) {
                  break L1;
                } else {
                  field_b = null;
                  break L1;
                }
              }
              var8 = 0;
              L2: while (true) {
                if (var8 >= var7) {
                  return var5 != 0;
                } else {
                  L3: {
                    var9 = param0.charAt(var8);
                    if (-1 == (var8 ^ -1)) {
                      if (45 != var9) {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          if (!param1) {
                            break L3;
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      } else {
                        var4 = 1;
                        var8++;
                        continue L2;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (var9 <= 57) {
                          var9 -= 48;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 65) {
                        break L6;
                      } else {
                        if (var9 > 90) {
                          break L6;
                        } else {
                          var9 -= 55;
                          break L4;
                        }
                      }
                    }
                    L7: {
                      if (var9 < 97) {
                        break L7;
                      } else {
                        if (var9 > 122) {
                          break L7;
                        } else {
                          var9 -= 87;
                          break L4;
                        }
                      }
                    }
                    return false;
                  }
                  if (var9 >= param2) {
                    return false;
                  } else {
                    L8: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var10 = var6 * param2 - -var9;
                    if (var6 != var10 / param2) {
                      return false;
                    } else {
                      var6 = var10;
                      var5 = 1;
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        }
        throw new IllegalArgumentException("" + param2);
    }

    protected final void finalize() throws Throwable {
        if (null != ((pa) this).field_d) {
            System.out.println("");
            ((pa) this).a((byte) -5);
        }
    }

    final static void a(String param0, byte param1, boolean param2, java.applet.Applet param3) {
        try {
            if (!(!d.field_b.startsWith("win"))) {
                if (gh.a(param0, false)) {
                    return;
                }
            }
            try {
                int var4_int = -83 / ((param1 - -55) / 62);
                param3.getAppletContext().showDocument(new java.net.URL(param0), "_blank");
            } catch (java.net.MalformedURLException malformedURLException) {
                gi.a((Throwable) null, "MGR1: " + param0, (byte) 125);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    pa(File param0, String param1, long param2) throws IOException {
        if (param2 == -1L) {
            param2 = 9223372036854775807L;
        }
        if ((param2 ^ -1L) > (param0.length() ^ -1L)) {
            boolean discarded$0 = param0.delete();
        }
        ((pa) this).field_d = new RandomAccessFile(param0, param1);
        ((pa) this).field_f = param2;
        ((pa) this).field_c = 0L;
        int var5 = ((pa) this).field_d.read();
        if (0 != (var5 ^ -1)) {
            if (!param1.equals((Object) (Object) "r")) {
                ((pa) this).field_d.seek(0L);
                ((pa) this).field_d.write(var5);
            }
        }
        ((pa) this).field_d.seek(0L);
    }

    final void a(long param0, boolean param1) throws IOException {
        ((pa) this).field_d.seek(param0);
        ((pa) this).field_c = param0;
        if (!param1) {
            field_e = null;
        }
    }

    final void a(byte param0) throws IOException {
        if (param0 != -5) {
            return;
        }
        if (null != ((pa) this).field_d) {
            ((pa) this).field_d.close();
            ((pa) this).field_d = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new uj();
        field_a = "Score: <%0>";
        field_e = "Waiting for sound effects";
        field_g = 0;
    }
}
