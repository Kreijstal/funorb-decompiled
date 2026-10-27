/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn {
    static int[] field_e;
    static hh field_f;
    static String field_d;
    int field_c;
    static String field_a;
    int field_b;

    final static boolean a(boolean param0, int param1) {
        if (di.field_d.field_e) {
          rk.field_e.a(oa.field_w, 100, 1536 * qm.field_c / 64, 8192);
        }
        if (param1 != 0) {
          return false;
        }
        if (!di.field_d.b((byte) -18)) {
          return false;
        }
        if (di.field_d.field_h == 0) {
          pa.a(true);
          mj.field_d = 0;
          p.field_h = 2;
          gi.a((byte) -74);
          return true;
        }
        if (di.field_d.field_h == 1) {
          IntValueNode.field_i = null;
          ce.field_f = new en();
          ua.field_c = new kg();
          mj.field_d = 0;
          PacketBuffer.field_h = false;
          pl.field_q.b(-26480, param0);
          gi.a((byte) -66);
          return true;
        }
        return false;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 > 120) {
          field_d = null;
          field_f = null;
          field_e = null;
          return;
        }
        field_e = (int[]) null;
        field_d = null;
        field_f = null;
        field_e = null;
    }

    final static int b(int param0) {
        int var7 = EscapeVector.obfuscationControl;
        try {
          boolean var1_int = false;
          boolean var2 = false;
          if (param0 != -14) {
            field_a = (String) null;
          }
          while (pn.p(-108)) {
            cb.field_c.c((byte) 6);
            if (cb.field_c.b((byte) -18)) {
              var1_int = true;
            }
            if (nk.field_n != 13) {
              continue;
            }
            var2 = true;
          }
          cb.field_c.a(hk.a((byte) 122, sf.field_c, ng.field_ob), (byte) 120, hk.a((byte) 122, dh.field_d, bj.field_y));
          if (cb.field_c.b((byte) -18)) {
            var1_int = true;
          }
          int var3 = 0;
          if (var1_int &&
            cb.field_c.field_h >= 0) {
            var3 = wh.field_j[cb.field_c.field_h];
            if (2 == var3) {
              ah.e(0);
            } else if (var3 == 5) {
              ah.e(0);
            }
          } else if (var2 &&
            f.field_j != 2) {
            ah.e(0);
          }
          if (var3 == 0 &&
            f.field_j == 2) {
            long var4 = -bd.field_k + td.b(param0 + 142);
            int var6 = (int)((-var4 + 10999L) / 1000L);
            if (0 >= var6) {
              sn.a(5, 0, true);
              var3 = 2;
            }
          }
          int stackIn_27_0 = var3;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "fn.E(" + param0 + ')');
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static String a(PacketBuffer param0, int param1, int param2) {
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            if (param1 != 10241) {
              field_a = (String) null;
            }
            int var3_int = param0.readUnsignedSmart(true);
            if (param2 < var3_int) {
              var3_int = param2;
            }
            byte[] var4 = new byte[var3_int];
            param0.position = param0.position + mn.field_q.a(var4, true, 0, param0.position, var3_int, param0.payload);
            String var5 = qi.a(var3_int, 0, var4, (byte) -94);
            String stackIn_5_0 = var5;
            return stackIn_5_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            Exception var3 = (Exception) (Object) decompiledCaughtException;
            String stackIn_7_0 = "Cabbage";
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          RuntimeException var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_10_0 = var3_ref;
          StringBuilder stackIn_10_1 = new StringBuilder().append("fn.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(char param0, byte param1) {
        if (Character.isISOControl(param0)) {
          return false;
        }
        if (k.a(true, param0)) {
          return true;
        }
        if (param1 != -124) {
          field_d = (String) null;
          if (45 == param0) {
            return true;
          }
          if (param0 == 160) {
            return true;
          }
          if (param0 == 32) {
            return true;
          }
          if (param0 != 95) {
            return false;
          }
          return true;
        }
        if (45 == param0) {
          return true;
        }
        if (param0 == 160) {
          return true;
        }
        if (param0 == 32) {
          return true;
        }
        if (param0 != 95) {
          return false;
        }
        return true;
    }

    fn(int param0, int param1) {
        this.field_b = param1;
        this.field_c = param0;
    }

    final static void a(byte param0) {
        int var2 = EscapeVector.obfuscationControl;
        try {
          if (param0 <= 30) {
            fn.a((byte) 80);
          }
          ib.field_f.a(237);
          for (int var1_int = 0; 32 > var1_int; var1_int++) {
            wi.field_d[var1_int] = 0L;
          }
          for (int var1_intLifetime1 = 0; var1_intLifetime1 < 32; var1_intLifetime1++) {
            c.field_t[var1_intLifetime1] = 0L;
          }
          s.field_z = 0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "fn.F(" + param0 + ')');
        }
    }

    static {
        field_e = new int[]{21, 1, 22};
        field_d = "If you do nothing the game will revert to normal view in <%0> second.";
        field_a = "CTRL";
    }
}
