/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mc {
    static vg field_i;
    private long field_c;
    static pd field_a;
    static ri[] field_h;
    static String field_g;
    static String field_b;
    static int field_e;
    private long field_d;
    private RandomAccessFile field_f;

    final void a(byte param0, long param1) throws IOException {
        this.field_f.seek(param1);
        this.field_c = param1;
        if (param0 >= -123) {
            this.field_c = -76L;
            return;
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_h = null;
        field_a = null;
        if (param0 <= 81) {
          mc.a((byte) -64);
          field_g = null;
          field_b = null;
          return;
        } else {
          field_g = null;
          field_b = null;
          return;
        }
    }

    final int a(int param0, byte[] param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
              var5_int = this.field_f.read(param1, param3, param0);
              if ((var5_int ^ -1) >= param2) {
                break L1;
              } else {
                this.field_c = this.field_c + (long)var5_int;
                break L1;
              }
            }
            stackOut_2_0 = var5_int;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("mc.G(").append(param0).append(',');
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
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    protected final void finalize() throws Throwable {
        if (!(this.field_f == null)) {
            System.out.println("");
            this.b((byte) 38);
        }
    }

    final static String a(long param0, byte param1) {
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var14 = null;
        StringBuilder var15 = null;
        StringBuilder var16 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        if (-1L > (param0 ^ -1L)) {
          if (-6582952005840035282L < (param0 ^ -1L)) {
            if (-1L != (param0 % 37L ^ -1L)) {
              var3 = 0;
              var4 = param0;
              L0: while (true) {
                if ((var4 ^ -1L) == -1L) {
                  if (param1 != 26) {
                    mc.a((byte) 85);
                    var16 = new StringBuilder(var3);
                    var6 = var16;
                    L1: while (true) {
                      L2: {
                        L3: {
                          if (param0 == 0L) {
                            break L3;
                          } else {
                            var7 = param0;
                            param0 = param0 / 37L;
                            var9 = hq.field_o[(int)(-(param0 * 37L) + var7)];
                            if (var11 != 0) {
                              break L2;
                            } else {
                              L4: {
                                if (var9 == 95) {
                                  var10 = -1 + var16.length();
                                  var16.setCharAt(var10, Character.toUpperCase(var16.charAt(var10)));
                                  var9 = 160;
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                              discarded$6 = var16.append((char) var9);
                              if (var11 == 0) {
                                continue L1;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        discarded$7 = var16.reverse();
                        var16.setCharAt(0, Character.toUpperCase(var16.charAt(0)));
                        break L2;
                      }
                      return var16.toString();
                    }
                  } else {
                    var15 = new StringBuilder(var3);
                    L5: while (true) {
                      L6: {
                        L7: {
                          if (param0 == 0L) {
                            break L7;
                          } else {
                            var7 = param0;
                            param0 = param0 / 37L;
                            var9 = hq.field_o[(int)(-(param0 * 37L) + var7)];
                            if (var11 != 0) {
                              break L6;
                            } else {
                              L8: {
                                if (var9 == 95) {
                                  var10 = -1 + var15.length();
                                  var15.setCharAt(var10, Character.toUpperCase(var15.charAt(var10)));
                                  var9 = 160;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              discarded$8 = var15.append((char) var9);
                              if (var11 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        discarded$9 = var15.reverse();
                        var15.setCharAt(0, Character.toUpperCase(var15.charAt(0)));
                        break L6;
                      }
                      return var15.toString();
                    }
                  }
                } else {
                  var3++;
                  var4 = var4 / 37L;
                  if (var11 == 0) {
                    continue L0;
                  } else {
                    var14 = new StringBuilder(var3);
                    L9: while (true) {
                      L10: {
                        L11: {
                          if (param0 == 0L) {
                            break L11;
                          } else {
                            var7 = param0;
                            param0 = param0 / 37L;
                            var9 = hq.field_o[(int)(-(param0 * 37L) + var7)];
                            if (var11 != 0) {
                              break L10;
                            } else {
                              L12: {
                                if (var9 == 95) {
                                  var10 = -1 + var14.length();
                                  var14.setCharAt(var10, Character.toUpperCase(var14.charAt(var10)));
                                  var9 = 160;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              discarded$10 = var14.append((char) var9);
                              if (var11 == 0) {
                                continue L9;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        discarded$11 = var14.reverse();
                        var14.setCharAt(0, Character.toUpperCase(var14.charAt(0)));
                        break L10;
                      }
                      return var14.toString();
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
        } else {
          return null;
        }
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
        if (this.field_d < this.field_c + (long)param2) {
            this.field_f.seek(this.field_d);
            this.field_f.write(1);
            throw new EOFException();
        }
        this.field_f.write(param3, param1, param2);
        if (param0 <= 9) {
            return;
        }
        try {
            this.field_c = this.field_c + (long)param2;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "mc.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final long a(int param0) throws IOException {
        if (param0 > -97) {
            field_e = 20;
            return this.field_f.length();
        }
        return this.field_f.length();
    }

    final void b(byte param0) throws IOException {
        if (param0 == 38) {
          if (null != this.field_f) {
            this.field_f.close();
            this.field_f = null;
            return;
          } else {
            return;
          }
        } else {
          field_i = (vg) null;
          if (null == this.field_f) {
            return;
          } else {
            this.field_f.close();
            this.field_f = null;
            return;
          }
        }
    }

    mc(File param0, String param1, long param2) throws IOException {
        boolean discarded$0 = false;
        int var5_int = 0;
        try {
            if (0L == (param2 ^ -1L)) {
                param2 = 9223372036854775807L;
            }
            if (param2 < param0.length()) {
                discarded$0 = param0.delete();
            }
            this.field_f = new RandomAccessFile(param0, param1);
            this.field_c = 0L;
            this.field_d = param2;
            var5_int = this.field_f.read();
            if (-1 != var5_int) {
                if (!param1.equals("r")) {
                    this.field_f.seek(0L);
                    this.field_f.write(var5_int);
                }
            }
            this.field_f.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "mc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Try changing the following settings:  ";
        field_i = null;
    }
}
