/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pl {
    static String field_c;
    static String field_b;
    static int field_g;
    static int field_h;
    static String[] field_k;
    private long field_l;
    private long field_i;
    static float[][] field_f;
    static int field_j;
    static boolean field_d;
    static vk field_e;
    private RandomAccessFile field_a;

    final int a(int param0, byte[] param1, byte param2, int param3) throws IOException {
        int var5 = 0;
        L0: {
          var5 = ((pl) this).field_a.read(param1, param0, param3);
          if ((var5 ^ -1) < -1) {
            ((pl) this).field_i = ((pl) this).field_i + (long)var5;
            break L0;
          } else {
            break L0;
          }
        }
        if (param2 >= -125) {
          return 32;
        } else {
          return var5;
        }
    }

    final void a(int param0, long param1) throws IOException {
        ((pl) this).field_a.seek(param1);
        if (param0 != 0) {
            ((pl) this).field_a = null;
            ((pl) this).field_i = param1;
            return;
        }
        ((pl) this).field_i = param1;
    }

    final long c(byte param0) throws IOException {
        int var2 = 82 % ((param0 - 69) / 51);
        return ((pl) this).field_a.length();
    }

    final void a(int param0, byte param1, byte[] param2, int param3) throws IOException {
        Object var6 = null;
        if (((long)param3 + ((pl) this).field_i ^ -1L) < (((pl) this).field_l ^ -1L)) {
          ((pl) this).field_a.seek(((pl) this).field_l);
          ((pl) this).field_a.write(1);
          throw new EOFException();
        } else {
          ((pl) this).field_a.write(param2, param0, param3);
          if (param1 != 68) {
            var6 = null;
            String discarded$2 = pl.a((byte) -58, (CharSequence) null);
            ((pl) this).field_i = ((pl) this).field_i + (long)param3;
            return;
          } else {
            ((pl) this).field_i = ((pl) this).field_i + (long)param3;
            return;
          }
        }
    }

    final static String a(byte param0) {
        if (ch.field_d != cf.field_b) {
          if (bb.field_a.a(0)) {
            if (cf.field_b != ed.field_c) {
              if (param0 != -69) {
                field_e = null;
                return bh.field_b;
              } else {
                return bh.field_b;
              }
            } else {
              return bb.field_a.a(true);
            }
          } else {
            return bb.field_a.a(true);
          }
        } else {
          return v.field_b;
        }
    }

    final void a(int param0) throws IOException {
        if (null == ((pl) this).field_a) {
          if (param0 == 19808) {
            return;
          } else {
            field_j = -18;
            return;
          }
        } else {
          ((pl) this).field_a.close();
          ((pl) this).field_a = null;
          if (param0 == 19808) {
            return;
          } else {
            field_j = -18;
            return;
          }
        }
    }

    final static void a(boolean param0, int param1, java.applet.Applet param2, String param3) {
        try {
            java.net.MalformedURLException var4 = null;
            Object var5 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (!md.field_f.startsWith("win")) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (cg.a(param3, (byte) 30)) {
                            statePc = 3;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            param2.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
                            if (param1 == 12430) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var5 = null;
                            String discarded$2 = pl.a((byte) -97, (CharSequence) null);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        var4 = (java.net.MalformedURLException) (Object) caughtException;
                        kk.a("MGR1: " + param3, (byte) 123, (Throwable) null);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(byte param0) {
        field_b = null;
        field_k = null;
        field_c = null;
        field_f = null;
        field_e = null;
        if (param0 == -77) {
          return;
        } else {
          String discarded$2 = pl.a((byte) -78);
          return;
        }
    }

    final static String a(byte param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        StringBuilder var10 = null;
        StringBuilder var14 = null;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param1 != null) {
          var2 = 0;
          var3 = param1.length();
          if (param0 > 99) {
            L0: while (true) {
              if (var3 > var2) {
                if (ok.a(-112, param1.charAt(var2))) {
                  var2++;
                  continue L0;
                } else {
                  L1: while (true) {
                    L2: {
                      if (var3 <= var2) {
                        break L2;
                      } else {
                        if (!ok.a(-62, param1.charAt(var3 + -1))) {
                          break L2;
                        } else {
                          var3--;
                          continue L1;
                        }
                      }
                    }
                    var4 = -var2 + var3;
                    if (var4 >= 1) {
                      if (-13 <= (var4 ^ -1)) {
                        L3: {
                          var14 = new StringBuilder(var4);
                          var6 = var2;
                          if (var3 <= var6) {
                            break L3;
                          } else {
                            L4: {
                              var7 = param1.charAt(var6);
                              if (!sl.a(0, (char) var7)) {
                                var6++;
                                break L4;
                              } else {
                                L5: {
                                  var8 = qb.a((char) var7, -201);
                                  if (var8 == 0) {
                                    var6++;
                                    break L5;
                                  } else {
                                    StringBuilder discarded$2 = var14.append(var8);
                                    break L5;
                                  }
                                }
                                var6++;
                                break L4;
                              }
                            }
                            var6++;
                            var6++;
                            var6++;
                            var6++;
                            break L3;
                          }
                        }
                        if (var14.length() == 0) {
                          return null;
                        } else {
                          return var14.toString();
                        }
                      } else {
                        return null;
                      }
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                L6: while (true) {
                  L7: {
                    if (var3 <= var2) {
                      break L7;
                    } else {
                      if (!ok.a(-62, param1.charAt(var3 + -1))) {
                        break L7;
                      } else {
                        var3--;
                        continue L6;
                      }
                    }
                  }
                  var4 = -var2 + var3;
                  if (var4 >= 1) {
                    if (-13 <= (var4 ^ -1)) {
                      L8: {
                        var10 = new StringBuilder(var4);
                        var6 = var2;
                        if (var3 <= var6) {
                          break L8;
                        } else {
                          L9: {
                            var7 = param1.charAt(var6);
                            if (!sl.a(0, (char) var7)) {
                              var6++;
                              break L9;
                            } else {
                              L10: {
                                var8 = qb.a((char) var7, -201);
                                if (var8 == 0) {
                                  var6++;
                                  break L10;
                                } else {
                                  StringBuilder discarded$3 = var10.append(var8);
                                  break L10;
                                }
                              }
                              var6++;
                              break L9;
                            }
                          }
                          var6++;
                          var6++;
                          var6++;
                          var6++;
                          break L8;
                        }
                      }
                      if (var10.length() == 0) {
                        return null;
                      } else {
                        return var10.toString();
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    protected final void finalize() throws Throwable {
        if (null == ((pl) this).field_a) {
            return;
        }
        System.out.println("");
        ((pl) this).a(19808);
    }

    pl(File param0, String param1, long param2) throws IOException {
        if ((param2 ^ -1L) == 0L) {
            param2 = 9223372036854775807L;
        }
        if ((param0.length() ^ -1L) < (param2 ^ -1L)) {
            boolean discarded$0 = param0.delete();
        }
        ((pl) this).field_a = new RandomAccessFile(param0, param1);
        ((pl) this).field_l = param2;
        ((pl) this).field_i = 0L;
        int var5 = ((pl) this).field_a.read();
        if (0 != (var5 ^ -1)) {
            // ifne L119
            ((pl) this).field_a.seek(0L);
            ((pl) this).field_a.write(var5);
        } else {
            ((pl) this).field_a.seek(0L);
            ((pl) this).field_a.seek(0L);
        }
        ((pl) this).field_a.seek(0L);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Main Menu";
        field_b = "Create";
        field_f = new float[20][2];
    }
}
