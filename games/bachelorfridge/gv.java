/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gv extends kj {
    private int field_f;

    final static void a(int param0, ht param1, java.awt.Frame param2) {
        eh var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = BachelorFridge.field_y;
        try {
          while (true) {
            var3 = param1.a(param2, false);
            while (var3.field_f == 0) {
              gda.a(false, 10L);
            }
            if (var3.field_f != 1) {
              gda.a(false, 100L);
              continue;
            }
            break;
          }
          if (param0 >= -84) {
            return;
          }
          param2.setVisible(false);
          param2.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("gv.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
          this.a(-85, true, -42);
        }
    }

    gv(gj param0, int param1, int param2) {
        super(param0, param1, param2);
    }

    final boolean b(int param0) {
        int fieldTemp$0 = this.field_f + 1;
        this.field_f = this.field_f + 1;
        if (fieldTemp$0 >= 60) {
          return true;
        }
        if (param0 > 21) {
          return false;
        }
        return true;
    }

    final void a(int param0, boolean param1, int param2) {
        int var4;
        int var5;
        var5 = BachelorFridge.field_y;
        if (this.field_f < 10) {
          var4 = (int)((double)param0 / 10.0) * this.field_f;
          gha.field_h.a(-128 + param2, var4 - 64);
        } else {
          if (30 >= this.field_f) {
            gha.field_h.a(-128 + param2, param0 - 64);
          } else {
            if ((2 & this.field_f) == 0) {
              gha.field_h.a(-128 + param2, -64 + param0, 128);
            }
          }
        }
        if (param1) {
          return;
        }
        this.b(-37);
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    static {
    }
}
