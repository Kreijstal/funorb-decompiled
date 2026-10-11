/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bg {
    private long field_b;
    private RandomAccessFile field_a;
    static int field_f;
    static int field_g;
    static int field_c;
    private long field_e;
    static nd field_d;

    final static boolean a(int param0, int param1) {
        if (param0 == 5) {
          return (-param1 & param1) == param1 ? true : false;
        }
        field_c = -41;
        return (-param1 & param1) == param1 ? true : false;
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        try {
          if (((long)param0 + this.field_b) > this.field_e) {
            this.field_a.seek(this.field_e);
            this.field_a.write(1);
            throw new EOFException();
          }
          this.field_a.write(param1, param2, param0);
          if (param3 != -17174) {
            this.field_a = (RandomAccessFile) null;
          }
          this.field_b = this.field_b + (long)param0;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "bg.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, long param1) throws IOException {
        this.field_a.seek(param1);
        if (param0 <= 29) {
          field_f = 20;
          this.field_b = param1;
          return;
        }
        this.field_b = param1;
    }

    final void a(byte param0) throws IOException {
        if (this.field_a != null) {
          this.field_a.close();
          this.field_a = null;
        }
        if (param0 == 20) {
          return;
        }
        bg.a(105, 68);
    }

    final static hb a(int param0, String[] param1) {
        hb stackIn_48_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        hb var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        hb var4 = null;
        hb var5 = null;
        var3 = HoldTheLine.field_D;
        try {
          var4 = new hb();
          var5 = var4;
          var2 = var5;
          if (param1[param0].equalsIgnoreCase("return")) {
            if (param1.length != 1) {
              throw new IllegalArgumentException();
            }
            var4.field_d = 0;
          }
          if (!param1[0].equalsIgnoreCase("activate")) {
            if (!param1[0].equalsIgnoreCase("powerups")) {
              if (!param1[0].equalsIgnoreCase("superpowertype")) {
                if (!param1[0].equalsIgnoreCase("laps")) {
                  if (param1[0].equalsIgnoreCase("pos")) {
                    if (param1.length != 4) {
                      throw new IllegalArgumentException();
                    }
                    var2.field_d = 9;
                    var2.field_c = mo.a((CharSequence) ((Object) param1[1]), (byte) -116);
                    var2.field_b = ka.a(5, param1[2]);
                    var2.field_e = mo.a((CharSequence) ((Object) param1[3]), (byte) -116);
                  } else {
                    if (param1[0].equalsIgnoreCase("playerzone")) {
                      if (param1.length != 3) {
                        throw new IllegalArgumentException();
                      }
                      var2.field_d = 2;
                      var2.field_c = ka.a(5, param1[1]);
                      var2.field_b = mo.a((CharSequence) ((Object) param1[2]), (byte) -116);
                    } else {
                      if (!param1[0].equalsIgnoreCase("missilehit")) {
                        if (!param1[0].equalsIgnoreCase("missilemiss")) {
                          if (param1[0].equalsIgnoreCase("racecomplete")) {
                            if (param1.length != 1) {
                              throw new IllegalArgumentException();
                            }
                            var2.field_d = 8;
                          }
                        } else {
                          if (1 != param1.length) {
                            throw new IllegalArgumentException();
                          }
                          var2.field_d = 7;
                        }
                      } else {
                        if (param1.length != 1) {
                          throw new IllegalArgumentException();
                        }
                        var2.field_d = 6;
                      }
                    }
                  }
                } else {
                  if (4 != param1.length) {
                    throw new IllegalArgumentException();
                  }
                  var2.field_d = 5;
                  var2.field_c = mo.a((CharSequence) ((Object) param1[1]), (byte) -116);
                  var2.field_b = ka.a(param0 ^ 5, param1[2]);
                  var2.field_e = mo.a((CharSequence) ((Object) param1[3]), (byte) -116);
                }
              } else {
                if (param1.length != 3) {
                  throw new IllegalArgumentException();
                }
                var4.field_d = 4;
                var4.field_c = mo.a((CharSequence) ((Object) param1[1]), (byte) -116);
                if (!param1[2].equalsIgnoreCase("none")) {
                  var2.field_b = vh.a(114, param1[2]);
                } else {
                  var5.field_b = -1;
                }
              }
            } else {
              if (param1.length != 4) {
                throw new IllegalArgumentException();
              }
              var4.field_d = 3;
              var4.field_c = vh.a(122, param1[1]);
              var4.field_b = ka.a(param0 ^ 5, param1[2]);
              var4.field_e = mo.a((CharSequence) ((Object) param1[3]), (byte) -116);
            }
          } else {
            if (param1.length != 1) {
              throw new IllegalArgumentException();
            }
            var5.field_d = 1;
          }
          stackIn_48_0 = var2;
          return stackIn_48_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_51_0 = var2_ref;
          stackIn_51_1 = new StringBuilder().append("bg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(')').toString());
        }
    }

    final long a(boolean param0) throws IOException {
        if (param0) {
          return 66L;
        }
        return this.field_a.length();
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_c = -44;
          field_d = null;
          return;
        }
        field_d = null;
    }

    protected final void finalize() throws Throwable {
        if (null != this.field_a) {
          System.out.println("");
          this.a((byte) 20);
        }
    }

    final int b(int param0, byte[] param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 11812) {
            stackIn_2_0 = -58;
            return stackIn_2_0;
          }
          var5_int = this.field_a.read(param1, param0, param2);
          if (var5_int > 0) {
            this.field_b = this.field_b + (long)var5_int;
          }
          stackIn_7_0 = var5_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("bg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    bg(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (param2 == -1L) {
            param2 = 9223372036854775807L;
          }
          if (param2 < param0.length()) {
            param0.delete();
          }
          this.field_a = new RandomAccessFile(param0, param1);
          this.field_e = param2;
          this.field_b = 0L;
          var5_int = this.field_a.read();
          if (var5_int != -1 &&
            !param1.equals("r")) {
            this.field_a.seek(0L);
            this.field_a.write(var5_int);
          }
          this.field_a.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "bg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        td.a(50, 14195);
    }
}
