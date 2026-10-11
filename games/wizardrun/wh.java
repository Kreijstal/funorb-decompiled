/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wh implements Iterator {
    static int[][] field_m;
    static String field_c;
    private gj field_i;
    static String[] field_l;
    static String field_b;
    static String[] field_e;
    static o field_d;
    private wl field_h;
    private int field_f;
    static int field_g;
    static rc field_j;
    static c field_k;
    private wl field_a;

    public static void a(int param0) {
        field_k = null;
        field_c = null;
        field_b = null;
        field_l = null;
        field_d = null;
        field_e = null;
        if (param0 != 339) {
          return;
        }
        field_m = (int[][]) null;
        field_j = null;
    }

    private final void a(byte param0) {
        this.field_f = 1;
        if (param0 > -41) {
          wh.b((byte) -23);
        }
        this.field_h = null;
        this.field_a = this.field_i.field_c[0].field_b;
    }

    public final void remove() {
        if (this.field_h == null) {
          throw new IllegalStateException();
        }
        this.field_h.a(false);
        this.field_h = null;
    }

    final static byte[] a(byte param0, CharSequence param1) {
        int var4 = 0;
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = wizardrun.field_H;
        try {
          var2_int = param1.length();
          var3 = new byte[var2_int];
          for (var4 = 0; var4 < var2_int; var4++) {
            {
              var5 = param1.charAt(var4);
              if ((0 >= var5 ||
                var5 >= 128) && (var5 < 160 ||
                255 < var5)) {
                switch (var5) {
                  case 8364:
                    var3[var4] = (byte)-128;
                    break;
                  case 8218:
                    var3[var4] = (byte)-126;
                    break;
                  case 402:
                    var3[var4] = (byte)-125;
                    break;
                  case 8222:
                    var3[var4] = (byte)-124;
                    break;
                  case 8230:
                    var3[var4] = (byte)-123;
                    break;
                  case 8224:
                    var3[var4] = (byte)-122;
                    break;
                  case 8225:
                    var3[var4] = (byte)-121;
                    break;
                  case 710:
                    var3[var4] = (byte)-120;
                    break;
                  case 8240:
                    var3[var4] = (byte)-119;
                    break;
                  case 352:
                    var3[var4] = (byte)-118;
                    break;
                  case 8249:
                    var3[var4] = (byte)-117;
                    break;
                  case 338:
                    var3[var4] = (byte)-116;
                    break;
                  case 381:
                    var3[var4] = (byte)-114;
                    break;
                  case 8216:
                    var3[var4] = (byte)-111;
                    break;
                  case 8217:
                    var3[var4] = (byte)-110;
                    break;
                  case 8220:
                    var3[var4] = (byte)-109;
                    break;
                  case 8221:
                    var3[var4] = (byte)-108;
                    break;
                  case 8226:
                    var3[var4] = (byte)-107;
                    break;
                  case 8211:
                    var3[var4] = (byte)-106;
                    break;
                  case 8212:
                    var3[var4] = (byte)-105;
                    break;
                  case 732:
                    var3[var4] = (byte)-104;
                    break;
                  case 8482:
                    var3[var4] = (byte)-103;
                    break;
                  case 353:
                    var3[var4] = (byte)-102;
                    break;
                  case 8250:
                    var3[var4] = (byte)-101;
                    break;
                  case 339:
                    var3[var4] = (byte)-100;
                    break;
                  case 382:
                    var3[var4] = (byte)-98;
                    break;
                  case 376:
                    var3[var4] = (byte)-97;
                    break;
                  default:
                    var3[var4] = (byte)63;
                    break;
                }
              } else {
                var3[var4] = (byte)var5;
              }
            }
          }
          if (param0 != -111) {
            wh.a(-75);
          }
          stackIn_69_0 = var3;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_72_0 = var2;
          stackIn_72_1 = new StringBuilder().append("wh.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(')').toString());
        }
    }

    final static void b(byte param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (param0 >= -28) {
          field_d = (o) null;
        }
        if (null != tc.field_m) {
          var1 = tc.field_m;
          synchronized (var1) {
            tc.field_m = null;
          }
        }
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        wl var1;
        int var2;
        var2 = wizardrun.field_H;
        if (this.field_i.field_c[-1 + this.field_f] != this.field_a) {
          var1 = this.field_a;
          this.field_h = var1;
          this.field_a = var1.field_b;
          return var1;
        }
        do {
          if (this.field_i.field_d <= this.field_f) {
            return null;
          }
          fieldTemp$0 = this.field_f;
          this.field_f = this.field_f + 1;
          var1 = this.field_i.field_c[fieldTemp$0].field_b;
        } while (var1 == this.field_i.field_c[this.field_f - 1]);
        this.field_a = var1.field_b;
        this.field_h = var1;
        return var1;
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = wizardrun.field_H;
        if (this.field_a != this.field_i.field_c[-1 + this.field_f]) {
          return true;
        }
        while (this.field_i.field_d > this.field_f) {
          fieldTemp$0 = this.field_f;
          this.field_f = this.field_f + 1;
          if (this.field_i.field_c[fieldTemp$0].field_b != this.field_i.field_c[this.field_f - 1]) {
            this.field_a = this.field_i.field_c[this.field_f - 1].field_b;
            return true;
          }
          this.field_a = this.field_i.field_c[this.field_f - 1];
        }
        return false;
    }

    wh(gj param0) {
        this.field_h = null;
        try {
          this.field_i = param0;
          this.a((byte) -67);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "wh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = new String[]{"All scores", "My scores", "Best each"};
        field_c = "This password contains your email address, and would be easy to guess";
        field_e = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_b = "Play free version";
    }
}
