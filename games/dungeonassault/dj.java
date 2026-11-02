/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dj {
    static volatile int field_d;
    private IntrusiveNode field_b;
    static int field_a;
    private IntrusiveDeque field_e;
    static String field_c;

    final IntrusiveNode c(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 17756) {
          IntrusiveNode var3 = (IntrusiveNode) null;
          this.a((IntrusiveNode) null, true);
          var2 = this.field_b;
          if (var2 != this.field_e.field_c) {
            this.field_b = var2.previous;
            return var2;
          }
          this.field_b = null;
          return null;
        }
        var2Lifetime1 = this.field_b;
        if (var2Lifetime1 != this.field_e.field_c) {
          this.field_b = var2Lifetime1.previous;
          return var2Lifetime1;
        }
        this.field_b = null;
        return null;
    }

    final static void a(int param0, int param1, long param2, int param3, String param4, int param5, int param6, int param7, int param8, boolean param9, int param10, boolean param11, byte param12, qg param13) {
        try {
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          PacketBuffer var16 = null;
          try {
            ra.field_c = new CipherPacketBuffer(param10);
            ac.field_B = new CipherPacketBuffer(param1);
            ld.field_g = param9;
            MouseInput.field_g = param8;
            kn.field_b = param0;
            fa.field_j = param11;
            an.field_E = param3;
            dn.field_Q = param2;
            if (param12 != -27) {
              var16 = (PacketBuffer) null;
              dj.a((PacketBuffer) null, (byte) 79);
            }
            l.field_b = param7;
            ii.field_D = param4;
            la.field_c = param5;
            sc.field_q = param13;
            rd.field_D = param6;
            if (null == sc.field_q.field_h) {
              return;
            }
            try {
              bk.field_b = new hd(sc.field_q.field_h, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = var15_ref;
            stackIn_15_1 = new StringBuilder().append("dj.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
            if (param13 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw vk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          if (param0 != 6623) {
            return false;
          }
          for (var2_int = 0; param1.length() > var2_int; var2_int++) {
            var3 = param1.charAt(var2_int);
            if (!uc.a(param0 - 854863799, (char) var3) &&
              !qm.a(57, (char) var3)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("dj.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final IntrusiveNode a(IntrusiveNode param0, boolean param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        IntrusiveNode stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            field_a = 16;
          }
          if (param0 == null) {
            var3 = this.field_e.field_c.next;
          } else {
            var3 = param0;
          }
          if (var3 == this.field_e.field_c) {
            this.field_b = null;
            stackIn_8_0 = null;
            return (IntrusiveNode) (stackIn_8_0);
          }
          this.field_b = var3.next;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("dj.H(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final IntrusiveNode b(int param0) {
        IntrusiveNode var2 = this.field_e.field_c.next;
        if (var2 == this.field_e.field_c) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.next;
        if (param0 == -1225818257) {
          return var2;
        }
        this.a(-5);
        return var2;
    }

    final IntrusiveNode a(boolean param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        IntrusiveNode stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        IntrusiveNode stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            var3 = this.field_e.field_c.previous;
          } else {
            var3 = param1;
          }
          if (!param0) {
            stackIn_5_0 = (IntrusiveNode) null;
            return stackIn_5_0;
          }
          if (var3 == this.field_e.field_c) {
            this.field_b = null;
            stackIn_9_0 = null;
            return (IntrusiveNode) (stackIn_9_0);
          }
          this.field_b = var3.previous;
          stackIn_11_0 = var3;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("dj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final IntrusiveNode d(int param0) {
        IntrusiveNode var2 = this.field_b;
        if (this.field_e.field_c == var2) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.next;
        if (param0 == 1834857157) {
          return var2;
        }
        field_a = 46;
        return var2;
    }

    final IntrusiveNode a(int param0) {
        IntrusiveNode var2 = this.field_e.field_c.previous;
        if (var2 == this.field_e.field_c) {
          this.field_b = null;
          return null;
        }
        if (param0 == -479592473) {
          this.field_b = var2.previous;
          return var2;
        }
        field_c = (String) null;
        this.field_b = var2.previous;
        return var2;
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 < 22) {
          qg var2 = (qg) null;
          dj.a(77, 24, 1L, 66, (String) null, -4, 49, 6, -5, true, 116, false, (byte) 34, (qg) null);
        }
    }

    final static String a(byte[] param0, boolean param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_4_0 = mk.a((byte) -24, param0, param0.length, 0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("dj.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    dj(IntrusiveDeque param0) {
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "dj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(PacketBuffer param0, byte param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          dh.field_g = param0.k(0) << 5;
          if (param1 < 122) {
            dj.a((byte) -97);
          }
          var2_int = param0.c(true);
          dh.field_g = dh.field_g + (var2_int >> 3);
          cm.field_P = var2_int << 18 & 1835008;
          cm.field_P = cm.field_P + (param0.k(0) << 2);
          var2_intLifetime1 = param0.c(true);
          fm.field_g = 2064384 & var2_intLifetime1 << 15;
          cm.field_P = cm.field_P + (var2_intLifetime1 >> 6);
          fm.field_g = fm.field_g + (param0.c(true) << 7);
          var2_intLifetime2 = param0.c(true);
          fm.field_g = fm.field_g + (var2_intLifetime2 >> 1);
          ln.field_e = 65536 & var2_intLifetime2 << 16;
          ln.field_e = ln.field_e + param0.k(0);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "dj.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_a = 0;
        field_d = -1;
        field_c = "Defence";
    }
}
