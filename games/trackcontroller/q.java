/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class q {
    private boolean field_l;
    int field_b;
    private long field_g;
    int field_f;
    static java.util.zip.CRC32 field_k;
    private int field_h;
    int[] field_i;
    private String field_d;
    int field_e;
    String field_n;
    static String[] field_m;
    static int field_a;
    static java.applet.Applet field_c;
    static String field_j;
    static String field_o;

    final int a(byte param0) {
        if (this.field_l) {
          return 2;
        }
        if (this.field_e != 2) {
          if (~this.field_g == ~fe.field_P) {
            return 1;
          }
          if (param0 > -41) {
            q.a(4);
          }
        } else {
          if (this.field_h > 0) {
            return 2;
          }
          if (~this.field_g == ~fe.field_P) {
            return 1;
          }
          if (param0 <= -41) {
            if (field_a != 2) {
              return 0;
            }
            if (ie.a(this.field_d, 2)) {
              return 1;
            }
            return 0;
          }
          q.a(4);
        }
        if (field_a != 2) {
          return 0;
        }
        if (!ie.a(this.field_d, 2)) {
          return 0;
        }
        return 1;
    }

    final static void a(boolean param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        la var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = TrackController.field_F ? 1 : 0;
        try {
          var1 = ra.field_C;
          if (!param0) {
            field_j = (String) null;
          }
          while (lg.c(-1)) {
            var1.c(8, 7);
            fieldTemp$0 = var1.field_k + 1;
            var1.field_k = var1.field_k + 1;
            var2 = fieldTemp$0;
            rc.a(78, var1);
            ra.field_C.a(param0, -var2 + var1.field_k);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1_ref), "q.D(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_j = null;
        field_o = null;
        int var1 = 36 % ((24 - param0) / 56);
        field_k = null;
        field_m = null;
    }

    q(boolean param0) {
        this.field_h = id.field_h;
        this.field_e = fd.field_e;
        if (!param0) {
          this.field_i = null;
        } else {
          this.field_i = hi.field_A;
        }
        this.field_l = nl.field_b;
        this.field_g = lg.field_a;
        this.field_d = o.field_b;
        this.field_b = jb.field_d;
        this.field_f = ka.field_c;
        this.field_n = li.field_l;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          String var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          int var3 = 0;
          String var4 = null;
          java.net.URL var5 = null;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          Throwable decompiledCaughtException = null;
          String var4Lifetime1;
          String var4Lifetime2;
          try {
            try {
              if (param1 != -1) {
                q.a(false);
              }
              var2 = param0.getDocumentBase().getFile();
              var4 = var2;
              var4Lifetime1 = var2;
              var3 = var2.indexOf('?');
              var4Lifetime2 = "reload.ws";
              if (var3 >= 0) {
                var4Lifetime2 = var4Lifetime2 + var2.substring(var3);
              }
              var5 = new java.net.URL(param0.getCodeBase(), var4Lifetime2);
              param0.getAppletContext().showDocument(of.a(param0, var5, false), "_self");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var2_ref2;
            stackIn_10_1 = new StringBuilder().append("q.B(");
            if (param0 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw sl.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_m = new String[]{"By rating", "By win percentage"};
        field_k = new java.util.zip.CRC32();
        field_j = "End Game";
        field_o = "Next page";
    }
}
