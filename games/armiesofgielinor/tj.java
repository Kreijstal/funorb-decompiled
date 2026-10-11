/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

class tj extends kb implements gw {
    static na field_C;
    NodeDeque field_D;

    final int g(int param0) {
        int var5 = 0;
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var2 = 0;
        NodeIterator var3 = new NodeIterator(this.field_D);
        if (param0 != -31989) {
          this.a(false);
        }
        kb var4 = (kb) (var3.first(param0 ^ -31943));
        while (var4 != null) {
          var5 = var4.g(-31989);
          if (var5 > var2) {
            var2 = var5;
          }
          var4 = (kb) (var3.next(50));
        }
        return var2;
    }

    final boolean b(byte param0, kb param1) {
        RuntimeException var3 = null;
        kb var4 = null;
        NodeIterator var5 = null;
        kb var6 = null;
        int var7 = 0;
        NodeIterator var8 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.field_D.a(false)) {
            return false;
          }
          var8 = new NodeIterator(this.field_D);
          if (param0 >= -121) {
            tj.d((byte) 127);
          }
          var4 = (kb) (var8.first(50));
          while (var4 != null) {
            if (var4.a(false)) {
              var5 = new NodeIterator(this.field_D);
              var5.a(var4, true);
              var6 = (kb) (var5.next(50));
              while (var6 != null) {
                if (!var6.a(11, param1)) {
                  var6 = (kb) (var5.next(50));
                  continue;
                }
                return true;
              }
            }
            var4 = (kb) (var8.next(50));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("tj.BC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    void f(int param0) {
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        NodeIterator var2 = new NodeIterator(this.field_D);
        if (param0 != 1) {
          field_C = (na) null;
        }
        kb var3 = (kb) (var2.first(50));
        while (var3 != null) {
          var3.f(param0 + 0);
          var3 = (kb) (var2.next(50));
        }
    }

    kb e(byte param0) {
        NodeIterator var2;
        kb var3;
        int var4;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = new NodeIterator(this.field_D);
        if (param0 < 24) {
          this.field_D = (NodeDeque) null;
        }
        var3 = (kb) (var2.first(50));
        while (var3 != null) {
          if (var3.a(false)) {
            return var3;
          }
          var3 = (kb) (var2.next(50));
        }
        return null;
    }

    boolean a(int param0, kb param1) {
        NodeIterator var3 = null;
        RuntimeException var3_ref = null;
        kb var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3 = new NodeIterator(this.field_D);
          if (param0 != 11) {
            return true;
          }
          var4 = (kb) (var3.first(param0 + 39));
          while (true) {
            if (var4 == null) {
              return false;
            }
            if (!var4.a(param0 ^ 0, param1)) {
              var4 = (kb) (var3.next(param0 + 39));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("tj.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean a(boolean param0, kb param1) {
        RuntimeException var3 = null;
        kb var4 = null;
        NodeIterator var5 = null;
        kb var6 = null;
        int var7 = 0;
        kb var8 = null;
        NodeIterator var9 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0) {
            var8 = (kb) null;
            this.a((kb) null, 21, '￘', -49);
          }
          if (this.field_D.a(param0)) {
            return false;
          }
          var9 = new NodeIterator(this.field_D);
          var4 = (kb) (var9.last(50));
          while (var4 != null) {
            if (var4.a(false)) {
              var5 = new NodeIterator(this.field_D);
              var5.a(false, var4);
              var6 = (kb) (var5.previous((byte) -112));
              while (var6 != null) {
                if (var6.a(11, param1)) {
                  return true;
                }
                var6 = (kb) (var5.previous((byte) -112));
              }
            }
            var4 = (kb) (var9.previous((byte) -112));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("tj.WB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, kb param6) {
        NodeIterator var8 = null;
        RuntimeException var8_ref = null;
        kb var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var8 = new NodeIterator(this.field_D);
          var9 = (kb) (var8.first(50));
          while (var9 != null) {
            if (var9.c(65280)) {
              if (var9.a(false) &&
                var9.a(param0, param1, param2, param3, param4, 94, param6)) {
                return true;
              }
              var9 = (kb) (var8.next(50));
              continue;
            }
            break;
          }
          if (param5 > 93) {
            return false;
          }
          this.g(116);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("tj.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(byte param0, kb param1) {
        try {
          this.field_D.addLast((byte) -119, (IntrusiveNode) (param1));
          if (param0 != 10) {
            this.f(-101);
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "tj.CC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    String h(int param0) {
        String var4 = null;
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        NodeIterator var2 = new NodeIterator(this.field_D);
        kb var3 = (kb) (var2.first(param0 ^ 21434));
        while (var3 != null) {
          var4 = var3.h(21384);
          if (var4 != null) {
            return var4;
          }
          var3 = (kb) (var2.next(50));
        }
        if (param0 == 21384) {
          return null;
        }
        this.field_D = (NodeDeque) null;
        return null;
    }

    boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        NodeIterator var8 = null;
        RuntimeException var8_ref = null;
        kb var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param3 <= 103) {
            field_C = (na) null;
          }
          var8 = new NodeIterator(this.field_D);
          var9 = (kb) (var8.first(50));
          while (var9 != null) {
            if (var9.c(65280)) {
              if (var9.a(param0, this.field_B + param1, this.field_p + param2, 107, param4, param5, param6)) {
                return true;
              }
              var9 = (kb) (var8.next(50));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("tj.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean a(boolean param0) {
        if (param0) {
          this.field_D = (NodeDeque) null;
        }
        return null != this.e((byte) 94) ? true : false;
    }

    final StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 26477) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(param3, param0, (byte) 96, param1)) {
            this.a(param0, param3, true, param1);
            this.a(param3, 81, param1, param0);
          }
          stackIn_6_0 = (StringBuilder) (param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("tj.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3 ^ 0, param4);
        if (param3 != 8192) {
          field_C = (na) null;
        }
        this.i(0);
    }

    private final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        NodeIterator var5 = null;
        kb var6 = null;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5 = new NodeIterator(this.field_D);
          var6 = (kb) (var5.first(50));
          if (param1 != 81) {
            return;
          }
          while (var6 != null) {
            discarded$3 = param2.append('\n');
            for (var7 = 0; param3 >= var7; var7++) {
              discarded$4 = param2.append(' ');
            }
            var6.a(1 + param3, param2, 26477, param0);
            var6 = (kb) (var5.next(50));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_11_0 = var5_ref;
          stackIn_11_1 = new StringBuilder().append("tj.UB(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, kb param1, int param2, byte param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        NodeIterator var7 = null;
        int var8 = 0;
        kb var9 = null;
        int var10 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var7 = new NodeIterator(this.field_D);
          var8 = -73 / ((-58 - param3) / 53);
          var9 = (kb) (var7.first(50));
          while (var9 != null) {
            if (var9.c(65280)) {
              var9.a(this.field_p + param0, param1, param2, (byte) -112, param4, param5 + this.field_B);
              var9 = (kb) (var7.next(50));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("tj.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        kb var8 = null;
        NodeIterator var9 = null;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var9 = new NodeIterator(this.field_D);
          var8 = (kb) (var9.first(50));
          while (var8 != null) {
            if (var8.c(65280)) {
              if (var8.a(false) &&
                var8.a(param0, param1, param2, -12215)) {
                return true;
              }
              var8 = (kb) (var9.next(50));
              continue;
            }
            break;
          }
          var6 = param1;
          if (var6 != 80) {
            if (param3 == -12215) {
              return false;
            }
            this.field_D = (NodeDeque) null;
            return false;
          }
          if (!br.field_f[81]) {
            stackIn_13_0 = this.b((byte) -123, param0);
          } else {
            stackIn_13_0 = this.a(false, param0);
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("tj.F(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, kb param3) {
        RuntimeException runtimeException = null;
        NodeIterator var5 = null;
        kb var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          super.a(param0, param1, param2, param3);
          var5 = new NodeIterator(this.field_D);
          var6 = (kb) (var5.first(50));
          while (var6 != null) {
            if (var6.c(param0 + 32558)) {
              var6.a(32722, this.field_B + param1, param2 + this.field_p, param3);
              var6 = (kb) (var5.next(50));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("tj.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void i(int param0) {
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        NodeIterator var2 = new NodeIterator(this.field_D);
        kb var3 = (kb) (var2.first(50));
        if (param0 != 0) {
          return;
        }
        while (var3 != null) {
          var3.e(0);
          var3 = (kb) (var2.next(50));
        }
    }

    tj(int param0, int param1, int param2, int param3, kh param4) {
        super(param0, param1, param2, param3, param4, (qo) null);
        this.field_D = new NodeDeque();
    }

    public static void d(byte param0) {
        if (param0 != -89) {
          tj.j(114);
        }
        field_C = null;
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (0 == param3 &&
          null != this.field_k) {
          this.field_k.a((kb) (this), param0, -94, true, param1);
        }
        NodeIterator var5 = new NodeIterator(this.field_D);
        kb var6 = (kb) (var5.last(50));
        while (var6 != null) {
          var6.a(param0 + this.field_B, this.field_p + param1, (byte) -101, param3);
          var6 = (kb) (var5.previous((byte) -112));
        }
        if (param2 >= -82) {
          this.i(108);
        }
    }

    final static void j(int param0) {
        try {
          int var2 = 0;
          IOException iOException = null;
          int var1_int = 0;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var1 = null;
          IOException var3 = null;
          var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          try {
            if (ai.field_T != null) {
              ai.field_T.c(-5758);
            }
            if (ou.field_h != null) {
              ou.field_h.a((byte) -117);
            }
            if (null != rg.field_b) {
              try {
                rg.field_b.c((byte) 81);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
              }
            }
            var1_int = -99 % ((param0 + 48) / 58);
            if (null != mu.field_b) {
              for (var2 = 0; var2 < mu.field_b.length; var2++) {
                if (null != mu.field_b[var2]) {
                  try {
                    mu.field_b[var2].c((byte) 81);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var3 = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
              return;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw ig.a((Throwable) ((Object) var1), "tj.AC(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
