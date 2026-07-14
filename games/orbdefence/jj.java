/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj extends kj {
    int field_A;
    static String field_B;

    final static String a(int param0, long param1) {
        int var3 = 0;
        long var4 = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        StringBuilder var13 = null;
        StringBuilder var14 = null;
        var11 = OrbDefence.field_D ? 1 : 0;
        if (param1 > 0L) {
          if (-6582952005840035282L < (param1 ^ -1L)) {
            if (0L != param1 % 37L) {
              var3 = 0;
              if (param0 != 14461) {
                var12 = null;
                jj.a((String) null, (byte) -111, (java.applet.Applet) null);
                var4 = param1;
                L0: while (true) {
                  if (-1L == (var4 ^ -1L)) {
                    var13 = new StringBuilder(var3);
                    L1: while (true) {
                      if (-1L == (param1 ^ -1L)) {
                        StringBuilder discarded$4 = var13.reverse();
                        var13.setCharAt(0, Character.toUpperCase(var13.charAt(0)));
                        return var13.toString();
                      } else {
                        L2: {
                          var7 = param1;
                          param1 = param1 / 37L;
                          var9 = nk.field_r[(int)(-(param1 * 37L) + var7)];
                          if (var9 != 95) {
                            break L2;
                          } else {
                            var10 = var13.length() - 1;
                            var13.setCharAt(var10, Character.toUpperCase(var13.charAt(var10)));
                            var9 = 160;
                            break L2;
                          }
                        }
                        StringBuilder discarded$5 = var13.append(var9);
                        continue L1;
                      }
                    }
                  } else {
                    var4 = var4 / 37L;
                    var3++;
                    continue L0;
                  }
                }
              } else {
                var4 = param1;
                L3: while (true) {
                  if (-1L == (var4 ^ -1L)) {
                    var14 = new StringBuilder(var3);
                    L4: while (true) {
                      if (-1L == (param1 ^ -1L)) {
                        StringBuilder discarded$6 = var14.reverse();
                        var14.setCharAt(0, Character.toUpperCase(var14.charAt(0)));
                        return var14.toString();
                      } else {
                        L5: {
                          var7 = param1;
                          param1 = param1 / 37L;
                          var9 = nk.field_r[(int)(-(param1 * 37L) + var7)];
                          if (var9 != 95) {
                            break L5;
                          } else {
                            var10 = var14.length() - 1;
                            var14.setCharAt(var10, Character.toUpperCase(var14.charAt(var10)));
                            var9 = 160;
                            break L5;
                          }
                        }
                        StringBuilder discarded$7 = var14.append(var9);
                        continue L4;
                      }
                    }
                  } else {
                    var4 = var4 / 37L;
                    var3++;
                    continue L3;
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        hj var5 = null;
        if (-1 != (param1 ^ -1)) {
          return;
        } else {
          if (((jj) this).field_y != null) {
            if (0 != ((jj) this).field_A) {
              if (((jj) this).field_A == 256) {
                ((jj) this).field_y.a(((jj) this).field_n + param0, param1, 1048575, ((jj) this).field_s + param3);
                return;
              } else {
                var5 = new hj(((jj) this).field_y.field_m, ((jj) this).field_y.field_r);
                de.a(-128, var5);
                ((jj) this).field_y.a(0, param1, param2, 0);
                oc.g((byte) -105);
                var5.a(((jj) this).field_s + param3, param0 - -((jj) this).field_n, ((jj) this).field_A);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    jj(pj param0) {
        super(param0.field_s, param0.field_n, param0.field_m, param0.field_r, (td) null, (ag) null);
        param0.a(0, 0, ((jj) this).field_r, (byte) -90, ((jj) this).field_m);
        ((jj) this).field_A = 256;
        ((jj) this).field_y = param0;
    }

    public jj() {
        super(0, 0, 0, 0, (td) null, (ag) null);
        ((jj) this).field_A = 256;
    }

    public static void k(int param0) {
        if (param0 != 37) {
            return;
        }
        field_B = null;
    }

    final static void a(String param0, byte param1, java.applet.Applet param2) {
        try {
            java.net.URL var3 = null;
            try {
                var3 = new java.net.URL(param2.getCodeBase(), param0);
                var3 = f.a(param2, var3, -95);
                int var4 = 106 / ((param1 - -46) / 47);
                ke.a(var3.toString(), true, (byte) -100, param2);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String l(int param0) {
        Object var2 = null;
        if (null == gb.field_h) {
          return "";
        } else {
          if (param0 >= -94) {
            var2 = null;
            jj.a((String) null, (byte) 69, (java.applet.Applet) null);
            return gb.field_h;
          } else {
            return gb.field_h;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Waiting for graphics";
    }
}
