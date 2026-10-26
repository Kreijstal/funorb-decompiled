/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fs {
    private long field_b;
    private long field_i;
    static long field_a;
    static as field_d;
    private RandomAccessFile field_h;
    static SpriteData titleImageData;
    static String field_f;
    static int field_c;
    static String field_g;

    public static void a(byte param0) {
        field_f = null;
        titleImageData = null;
        field_g = null;
        field_d = null;
        if (param0 <= 104) {
          fs.a((byte) -17);
        }
    }

    protected final void finalize() throws Throwable {
        if (null != this.field_h) {
          System.out.println("");
          this.a(19260);
        }
    }

    final int a(int param0, byte param1, int param2, byte[] param3) throws IOException {
        String stackIn_10_2 = null;
        try {
          int var5_int = this.field_h.read(param3, param2, param0);
          if (0 < var5_int) {
            this.field_b = this.field_b + (long)var5_int;
          }
          if (param1 != 53) {
            this.field_h = (RandomAccessFile) null;
          }
          int stackIn_6_0 = var5_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var5;
          StringBuilder stackIn_9_1 = new StringBuilder().append("fs.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        try {
          if ((long)param3 + this.field_b > this.field_i) {
            this.field_h.seek(this.field_i);
            this.field_h.write(1);
            throw new EOFException();
          }
          this.field_h.write(param0, param1, param3);
          if (param2 < 5) {
            byte[] var6 = (byte[]) null;
            fs.a(false, -127, (CharSequence) null, (byte[]) null, -72, -17);
          }
          this.field_b = this.field_b + (long)param3;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "fs.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(long param0, boolean param1) throws IOException {
        this.field_h.seek(param0);
        this.field_b = param0;
        if (!param1) {
          fs.a((byte) 118);
        }
    }

    final void a(int param0) throws IOException {
        if (param0 != 19260) {
          field_d = (as) null;
        }
        if (null != this.field_h) {
          this.field_h.close();
          this.field_h = null;
        }
    }

    final static int a(boolean param0, int param1, CharSequence param2, byte[] param3, int param4, int param5) {
        String stackIn_74_2 = null;
        String stackIn_77_2 = null;
        int var9 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param0) {
            int stackIn_3_0 = 26;
            return stackIn_3_0;
          }
          int var6_int = param1 - param5;
          for (int var7 = 0; var6_int > var7; var7++) {
            {
              int var8 = param2.charAt(var7 + param5);
              if ((var8 <= 0 ||
                var8 >= 128) && (160 > var8 ||
                var8 > 255)) {
                switch (var8) {
                  case 8364:
                    param3[param4 + var7] = (byte)-128;
                    break;
                  case 8218:
                    param3[var7 + param4] = (byte)-126;
                    break;
                  case 402:
                    param3[param4 + var7] = (byte)-125;
                    break;
                  case 8222:
                    param3[param4 + var7] = (byte)-124;
                    break;
                  case 8230:
                    param3[var7 + param4] = (byte)-123;
                    break;
                  case 8224:
                    param3[param4 + var7] = (byte)-122;
                    break;
                  case 8225:
                    param3[param4 + var7] = (byte)-121;
                    break;
                  case 710:
                    param3[var7 + param4] = (byte)-120;
                    break;
                  case 8240:
                    param3[param4 + var7] = (byte)-119;
                    break;
                  case 352:
                    param3[param4 + var7] = (byte)-118;
                    break;
                  case 8249:
                    param3[param4 + var7] = (byte)-117;
                    break;
                  case 338:
                    param3[param4 + var7] = (byte)-116;
                    break;
                  case 381:
                    param3[var7 + param4] = (byte)-114;
                    break;
                  case 8216:
                    param3[var7 + param4] = (byte)-111;
                    break;
                  case 8217:
                    param3[var7 + param4] = (byte)-110;
                    break;
                  case 8220:
                    param3[var7 + param4] = (byte)-109;
                    break;
                  case 8221:
                    param3[var7 + param4] = (byte)-108;
                    break;
                  case 8226:
                    param3[var7 + param4] = (byte)-107;
                    break;
                  case 8211:
                    param3[param4 + var7] = (byte)-106;
                    break;
                  case 8212:
                    param3[param4 + var7] = (byte)-105;
                    break;
                  case 732:
                    param3[var7 + param4] = (byte)-104;
                    break;
                  case 8482:
                    param3[var7 + param4] = (byte)-103;
                    break;
                  case 353:
                    param3[var7 + param4] = (byte)-102;
                    break;
                  case 8250:
                    param3[var7 + param4] = (byte)-101;
                    break;
                  case 339:
                    param3[var7 + param4] = (byte)-100;
                    break;
                  case 382:
                    param3[var7 + param4] = (byte)-98;
                    break;
                  case 376:
                    param3[var7 + param4] = (byte)-97;
                    break;
                  default:
                    param3[var7 + param4] = (byte)63;
                    break;
                }
              } else {
                param3[param4 + var7] = (byte)var8;
              }
            }
          }
          int stackIn_70_0 = var6_int;
          return stackIn_70_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_73_0 = var6;
          StringBuilder stackIn_73_1 = new StringBuilder().append("fs.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          StringBuilder stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
          if (param3 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    fs(File param0, String param1, long param2) throws IOException {
        try {
          if (param2 == -1L) {
            param2 = 9223372036854775807L;
          }
          if (param0.length() > param2) {
            param0.delete();
          }
          this.field_h = new RandomAccessFile(param0, param1);
          this.field_b = 0L;
          this.field_i = param2;
          int var5_int = this.field_h.read();
          if (var5_int != -1 &&
            !param1.equals("r")) {
            this.field_h.seek(0L);
            this.field_h.write(var5_int);
          }
          this.field_h.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "fs.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final long a(boolean param0) throws IOException {
        if (param0) {
          return 36L;
        }
        return this.field_h.length();
    }

    static {
        field_f = "Friends can be added in multiplayer<nbsp>games";
        field_d = new as();
    }
}
