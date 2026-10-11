/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class f implements Iterator {
    private wb field_a;
    static km[] field_f;
    static ml field_j;
    private eb field_e;
    static String field_d;
    private wb field_i;
    static km field_c;
    static String field_g;
    static int field_b;
    static String field_h;

    final static String a(int param0) {
        if (param0 != 8) {
          f.a((byte) -24);
        }
        if (pa.field_l == ao.field_Kb) {
          return ea.field_e;
        }
        return wd.field_d;
    }

    final static int a(int param0, int param1, int param2, int param3, byte[] param4, CharSequence param5) {
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          var6_int = param0 - param3;
          if (param2 > -120) {
            stackIn_3_0 = 107;
            return stackIn_3_0;
          }
          for (var7 = 0; var6_int > var7; var7++) {
            {
              var8 = param5.charAt(var7 + param3);
              if ((var8 <= 0 ||
                var8 >= 128) && (160 > var8 ||
                var8 > 255)) {
                switch (var8) {
                  case 8364:
                    param4[param1 + var7] = (byte)-128;
                    break;
                  case 8218:
                    param4[param1 + var7] = (byte)-126;
                    break;
                  case 402:
                    param4[param1 + var7] = (byte)-125;
                    break;
                  case 8222:
                    param4[param1 + var7] = (byte)-124;
                    break;
                  case 8230:
                    param4[param1 + var7] = (byte)-123;
                    break;
                  case 8224:
                    param4[param1 + var7] = (byte)-122;
                    break;
                  case 8225:
                    param4[param1 + var7] = (byte)-121;
                    break;
                  case 710:
                    param4[var7 + param1] = (byte)-120;
                    break;
                  case 8240:
                    param4[param1 + var7] = (byte)-119;
                    break;
                  case 352:
                    param4[param1 + var7] = (byte)-118;
                    break;
                  case 8249:
                    param4[var7 + param1] = (byte)-117;
                    break;
                  case 338:
                    param4[param1 + var7] = (byte)-116;
                    break;
                  case 381:
                    param4[var7 + param1] = (byte)-114;
                    break;
                  case 8216:
                    param4[param1 + var7] = (byte)-111;
                    break;
                  case 8217:
                    param4[param1 + var7] = (byte)-110;
                    break;
                  case 8220:
                    param4[param1 + var7] = (byte)-109;
                    break;
                  case 8221:
                    param4[param1 + var7] = (byte)-108;
                    break;
                  case 8226:
                    param4[param1 + var7] = (byte)-107;
                    break;
                  case 8211:
                    param4[param1 + var7] = (byte)-106;
                    break;
                  case 8212:
                    param4[param1 + var7] = (byte)-105;
                    break;
                  case 732:
                    param4[var7 + param1] = (byte)-104;
                    break;
                  case 8482:
                    param4[param1 + var7] = (byte)-103;
                    break;
                  case 353:
                    param4[param1 + var7] = (byte)-102;
                    break;
                  case 8250:
                    param4[var7 + param1] = (byte)-101;
                    break;
                  case 339:
                    param4[param1 + var7] = (byte)-100;
                    break;
                  case 382:
                    param4[param1 + var7] = (byte)-98;
                    break;
                  case 376:
                    param4[param1 + var7] = (byte)-97;
                    break;
                  default:
                    param4[param1 + var7] = (byte)63;
                    break;
                }
              } else {
                param4[param1 + var7] = (byte)var8;
              }
            }
          }
          stackIn_70_0 = var6_int;
          return stackIn_70_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_73_0 = var6;
          stackIn_73_1 = new StringBuilder().append("f.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
          if (param5 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        ac.field_e = false;
        if (dk.field_v != null) {
          dk.field_v.h(1026);
        }
        if (sd.field_e != 0) {
          re.c((byte) 121);
        }
        if (param0 > -26) {
          f.b((byte) -19);
        }
        bf.field_o = 0;
    }

    public final Object next() {
        Object var1 = this.field_a;
        if (this.field_e.field_e != var1) {
          this.field_a = ((wb) (var1)).field_h;
        } else {
          this.field_a = null;
          var1 = null;
        }
        this.field_i = (wb) (var1);
        return var1;
    }

    final static boolean b(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -844) {
          field_d = (String) null;
        }
        stackIn_6_0 = (mi.a((byte) -119)) && ((8 & id.field_r) == 0);
        return stackIn_6_0;
    }

    public final boolean hasNext() {
        return this.field_a != this.field_e.field_e;
    }

    public static void b(byte param0) {
        field_h = null;
        field_c = null;
        field_d = null;
        int var1 = 57 / ((47 - param0) / 48);
        field_j = null;
        field_f = null;
        field_g = null;
    }

    f(eb param0) {
        this.field_i = null;
        try {
          this.field_e = param0;
          this.field_a = this.field_e.field_e.field_h;
          this.field_i = null;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "f.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(char param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = Virogrid.field_F ? 1 : 0;
        if (param2 >= -3) {
          field_c = (km) null;
        }
        char[] var6 = new char[param1];
        char[] var3 = var6;
        for (var4 = 0; var4 < param1; var4++) {
          var6[var4] = param0;
        }
        return new String(var6);
    }

    public final void remove() {
        if (this.field_i == null) {
          throw new IllegalStateException();
        }
        this.field_i.c(25);
        this.field_i = null;
    }

    static {
        field_g = "RuneScape clan";
        field_d = "Set up new game";
        field_h = "Hide lobby chat";
    }
}
