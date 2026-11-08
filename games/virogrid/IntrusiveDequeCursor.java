/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class IntrusiveDequeCursor {
    static String field_a;
    static kf field_c;
    private IntrusiveDeque field_g;
    private IntrusiveNode field_b;
    static SpriteWidget field_e;
    static wg field_h;
    static String field_f;
    static String field_d;

    final IntrusiveNode b(int param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        IntrusiveNode stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            var3 = this.field_g.field_i.next;
          } else {
            var3 = param1;
          }
          if (this.field_g.field_i == var3) {
            this.field_b = null;
            stackIn_5_0 = null;
            return (IntrusiveNode) (stackIn_5_0);
          }
          if (param0 != 1) {
            IntrusiveDequeCursor.a(false);
          }
          this.field_b = var3.next;
          stackIn_9_0 = var3;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ma.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static int a(boolean param0) {
        if (param0) {
          IntrusiveDequeCursor.releaseStatics(-1);
          return -gi.field_c + qg.field_g;
        }
        return -gi.field_c + qg.field_g;
    }

    final IntrusiveNode a(byte param0) {
        IntrusiveNode var2 = this.field_g.field_i.next;
        if (var2 == this.field_g.field_i) {
          this.field_b = null;
          return null;
        }
        if (param0 == 48) {
          this.field_b = var2.next;
          return var2;
        }
        field_c = (kf) null;
        this.field_b = var2.next;
        return var2;
    }

    final IntrusiveNode a(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != -1) {
          IntrusiveNode var3 = (IntrusiveNode) null;
          this.b(83, (IntrusiveNode) null);
          var2 = this.field_b;
          if (var2 == this.field_g.field_i) {
            this.field_b = null;
            return null;
          }
          this.field_b = var2.next;
          return var2;
        }
        var2Lifetime1 = this.field_b;
        if (var2Lifetime1 == this.field_g.field_i) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2Lifetime1.next;
        return var2Lifetime1;
    }

    final IntrusiveNode a(int param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        IntrusiveNode stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            var3 = this.field_g.field_i.previous;
          } else {
            var3 = param1;
          }
          if (this.field_g.field_i == var3) {
            this.field_b = null;
            stackIn_5_0 = null;
            return (IntrusiveNode) (stackIn_5_0);
          }
          this.field_b = var3.previous;
          if (param0 >= -64) {
            field_a = (String) null;
          }
          stackIn_9_0 = var3;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ma.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static String a(int param0, Throwable param1) throws IOException {
        String var2;
        PrintWriter var4;
        int var9;
        int var10;
        String var11;
        int var12;
        int var13;
        rg var14;
        StringWriter var15;
        String var20;
        BufferedReader var21;
        String var22;
        String var23;
        String var24;
        String var25;
        String var26;
        String var27;
        BufferedReader var6;
        String var7;
        String var28;
        BufferedReader var29;
        String var30;
        String var31;
        String var32;
        String var33;
        String var34;
        String var35;
        String var39;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        String var2Lifetime4;
        String var2Lifetime5;
        String var11Lifetime1;
        String var11Lifetime2;
        String var11Lifetime3;
        String var11Lifetime4;
        String var11Lifetime5;
        String var2Lifetime1Lifetime1;
        String var2Lifetime1Lifetime2;
        String var2Lifetime5Lifetime1;
        String var2Lifetime5Lifetime2;
        String var2Lifetime5Lifetime3;
        String var2Lifetime5Lifetime4;
        String var2Lifetime5Lifetime5;
        String var2Lifetime5Lifetime6;
        String var2Lifetime5Lifetime7;
        String var2Lifetime5Lifetime8;
        String var2Lifetime5Lifetime9;
        String var2Lifetime5Lifetime10;
        String var2Lifetime5Lifetime11;
        String var2Lifetime5Lifetime12;
        String var11Lifetime1Lifetime1;
        String var11Lifetime1Lifetime2;
        String var11Lifetime5Lifetime1;
        var13 = Virogrid.field_F ? 1 : 0;
        if (param1 instanceof rg) {
          var14 = (rg) ((Object) param1);
          param1 = var14.field_a;
          var2 = var14.field_c + " | ";
          var11 = var2;
        } else {
          var2 = "";
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        param1.printStackTrace(var4);
        var4.close();
        if (param0 == 40) {
          var20 = var15.toString();
          var2Lifetime1 = var20;
          var11Lifetime1 = var20;
          var21 = new BufferedReader((Reader) ((Object) new StringReader(var20)));
          var27 = var21.readLine();
          var2Lifetime1Lifetime1 = var27;
          var11Lifetime1Lifetime1 = var27;
          while (true) {
            var22 = var21.readLine();
            var2Lifetime1Lifetime2 = var22;
            var11Lifetime1Lifetime2 = var22;
            var2Lifetime1Lifetime2 = var11Lifetime1Lifetime2;
            if (var22 == null) {
              var2Lifetime1Lifetime2 = var11Lifetime1Lifetime2;
              var11Lifetime1Lifetime2 = var2Lifetime1Lifetime2;
              var2Lifetime1Lifetime2 = var11Lifetime1Lifetime2;
              var2Lifetime1Lifetime2 = var2Lifetime1Lifetime2 + "| " + var27;
              var11Lifetime1Lifetime2 = var2Lifetime1Lifetime2;
              return var2Lifetime1Lifetime2;
            }
            var9 = var22.indexOf('(');
            var10 = var22.indexOf(')', 1 + var9);
            if (-1 == var9) {
              var11Lifetime1Lifetime2 = var22;
              var2Lifetime1Lifetime2 = var11Lifetime1Lifetime2;
              var2Lifetime1Lifetime2 = var11Lifetime1Lifetime2;
            } else {
              var11Lifetime1Lifetime2 = var22.substring(0, var9);
            }
            var23 = var11Lifetime1Lifetime2.trim();
            var2Lifetime1Lifetime2 = var23;
            var2Lifetime1Lifetime2 = var23;
            var24 = var23.substring(1 + var23.lastIndexOf(' '));
            var2Lifetime1Lifetime2 = var24;
            var2Lifetime1Lifetime2 = var24;
            var25 = var24.substring(var24.lastIndexOf('\t') + 1);
            var2Lifetime1Lifetime2 = var25;
            var2Lifetime1Lifetime2 = var25;
            var26 = var2Lifetime1Lifetime2 + var25;
            var2Lifetime1Lifetime2 = var26;
            var2Lifetime1Lifetime2 = var26;
            var2Lifetime1Lifetime2 = var26;
            if (var9 != -1 &&
              var10 != -1) {
              var12 = var22.indexOf(".java:", var9);
              if (var12 >= 0) {
                var2Lifetime1Lifetime2 = var26 + var22.substring(5 + var12, var10);
              }
            }
            var2Lifetime1Lifetime2 = var2Lifetime1Lifetime2 + ' ';
          }
        }
        field_d = (String) null;
        var28 = var15.toString();
        var2Lifetime2 = var28;
        var11Lifetime2 = var28;
        var29 = new BufferedReader((Reader) ((Object) new StringReader(var28)));
        var6 = var29;
        var35 = var29.readLine();
        var2Lifetime3 = var35;
        var11Lifetime3 = var35;
        var7 = var35;
        var2Lifetime4 = var7;
        var11Lifetime4 = var7;
        while (true) {
          var30 = var29.readLine();
          var2Lifetime5 = var30;
          var11Lifetime5 = var30;
          var2Lifetime5Lifetime1 = var11Lifetime5;
          if (var30 == null) {
            var2Lifetime5Lifetime2 = var11Lifetime5;
            var11Lifetime5 = var2Lifetime5Lifetime2;
            var2Lifetime5Lifetime2 = var11Lifetime5;
            var2Lifetime5Lifetime2 = var2Lifetime5Lifetime2 + "| " + var35;
            var39 = var2Lifetime5Lifetime2;
            var11Lifetime5 = var2Lifetime5Lifetime2;
            return var2Lifetime5Lifetime2;
          }
          var9Lifetime1 = var30.indexOf('(');
          var10Lifetime1 = var30.indexOf(')', 1 + var9Lifetime1);
          if (-1 == var9Lifetime1) {
            var11Lifetime5Lifetime1 = var30;
            var2Lifetime5Lifetime3 = var11Lifetime5Lifetime1;
            var2Lifetime5Lifetime3 = var11Lifetime5Lifetime1;
          } else {
            var11Lifetime5Lifetime1 = var30.substring(0, var9Lifetime1);
          }
          var31 = var11Lifetime5Lifetime1.trim();
          var2Lifetime5Lifetime4 = var31;
          var2Lifetime5Lifetime5 = var31;
          var32 = var31.substring(1 + var31.lastIndexOf(' '));
          var2Lifetime5Lifetime6 = var32;
          var2Lifetime5Lifetime7 = var32;
          var33 = var32.substring(var32.lastIndexOf('\t') + 1);
          var2Lifetime5Lifetime8 = var33;
          var2Lifetime5Lifetime9 = var33;
          var34 = var2Lifetime5Lifetime9 + var33;
          var2Lifetime5Lifetime10 = var34;
          var2Lifetime5Lifetime11 = var34;
          var2Lifetime5Lifetime12 = var34;
          if (var9Lifetime1 != -1 &&
            var10Lifetime1 != -1) {
            var12Lifetime1 = var30.indexOf(".java:", var9Lifetime1);
            if (var12Lifetime1 >= 0) {
              var2Lifetime5Lifetime12 = var34 + var30.substring(5 + var12Lifetime1, var10Lifetime1);
            }
          }
          var2Lifetime5Lifetime12 = var2Lifetime5Lifetime12 + ' ';
        }
    }

    final IntrusiveNode next(int param0) {
        if (param0 != 12677) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.field_g.field_i.previous;
        if (this.field_g.field_i != var2) {
          this.field_b = var2.previous;
          return var2;
        }
        this.field_b = null;
        return null;
    }

    IntrusiveDequeCursor(IntrusiveDeque param0) {
        try {
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ma.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_f = null;
        field_e = null;
        field_c = null;
        field_a = null;
        field_h = null;
        if (param0 == 0) {
          field_d = null;
          return;
        }
        IntrusiveDequeCursor.a(false);
        field_d = null;
    }

    final IntrusiveNode b(int param0) {
        IntrusiveNode var2 = this.field_b;
        if (var2 == this.field_g.field_i) {
          this.field_b = null;
          return null;
        }
        if (param0 == 41) {
          this.field_b = var2.previous;
          return var2;
        }
        IntrusiveNode var3 = (IntrusiveNode) null;
        this.b(-37, (IntrusiveNode) null);
        this.field_b = var2.previous;
        return var2;
    }

    static {
        field_a = "Please check if address is correct";
        field_f = "Searching for an opponent";
        field_d = "Unfortunately you are not eligible to create an account.";
    }
}
