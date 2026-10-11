/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o {
    static int field_b;
    static String[] field_a;
    static bg[] field_c;

    final static void a(int param0, int param1, int param2, pk param3, int param4, int param5) {
        try {
          gl.c((byte) 123);
          if (param0 != 50) {
            field_b = -25;
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "o.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void b(int param0, byte param1) {
        int var3 = 0;
        fb var4 = null;
        nd var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Terraphoenix.field_V;
        try {
          var4 = (fb) (hd.field_p.d(9272));
          while (var4 != null) {
            mh.a(var4, param0, 0);
            var4 = (fb) (hd.field_p.e((byte) -119));
          }
          if (param1 >= -38) {
            o.b(48, (byte) 24);
          }
          var5 = (nd) (r.field_Q.d(9272));
          while (var5 != null) {
            gb.a((byte) 15, var5, param0);
            var5 = (nd) (r.field_Q.e((byte) -119));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2), "o.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
          field_b = -49;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final boolean a(boolean param0) {
        if (!param0) {
          field_b = 60;
          if (this == af.field_b) {
            return true;
          }
          if (gb.field_B != this) {
            return this == od.field_g ? true : false;
          }
          return true;
        }
        if (this == af.field_b) {
          return true;
        }
        if (gb.field_B == this) {
          return true;
        }
        if (this != od.field_g) {
          return false;
        }
        return true;
    }

    final static int a(int param0, byte param1) {
        int var2;
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = Terraphoenix.field_V;
        hm.field_N = 0;
        bj.field_c = null;
        gi.field_l = null;
        var2 = lg.field_h;
        lg.field_h = ml.field_s;
        jg.field_kb.field_i = jg.field_kb.field_i + 1;
        if (param0 == 51) {
          jg.field_kb.field_l = 2;
          var3 = 58 / ((param1 + 54) / 55);
          ml.field_s = var2;
          if (jg.field_kb.field_i >= 2 &&
            param0 == 51) {
            return 2;
          }
          if (jg.field_kb.field_i >= 2 &&
            50 == param0) {
            return 5;
          }
          if (4 > jg.field_kb.field_i) {
            return -1;
          }
          return 1;
        }
        if (50 != param0) {
          jg.field_kb.field_l = 1;
          var3Lifetime1 = 58 / ((param1 + 54) / 55);
          ml.field_s = var2;
          if (jg.field_kb.field_i < 2) {
            if (jg.field_kb.field_i >= 2 &&
              50 == param0) {
              return 5;
            }
            if (4 > jg.field_kb.field_i) {
              return -1;
            }
            return 1;
          }
          if (param0 == 51) {
            return 2;
          }
        } else {
          jg.field_kb.field_l = 5;
          var3Lifetime1 = 58 / ((param1 + 54) / 55);
          ml.field_s = var2;
          if (jg.field_kb.field_i >= 2 &&
            param0 == 51) {
            return 2;
          }
        }
        if (jg.field_kb.field_i >= 2 &&
          50 == param0) {
          return 5;
        }
        if (4 <= jg.field_kb.field_i) {
          return 1;
        }
        return -1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_a = new String[]{"Movement modes", "<col=fcfe7f>READY MODE<br></col>When in ready mode your soldier fires accurate shots and will pause if they see a target while moving. Soldiers return to ready mode every time you end the turn.", "<col=fcfe7f>SPRINT MODE<br></col>While in sprint mode a soldier moves faster across the landscape but their accuracy is significantly reduced and the soldier will not take advantage of cover or stop on sighting a new enemy. Remember also that it takes some time to return your gun to the ready position.", "<col=fcfe7f>UNITS WITH PISTOLS OR SHOTGUNS<br></col>Sprint mode is not a problem as your weapons are inaccurate anyway. Run up to your target and shoot them at point blank range before retreating to cover.", "<col=fcfe7f>UNITS WITH RIFLES OR MACHINE GUNS<br></col>Move carefully towards your target making use of cover and save lots of time to fire back if attacked. If you encounter an enemy who you will not be able to neutralise on the current turn, switch to sprint mode and retreat to cover.", "<col=fcfe7f>ARMOUR<br></col>Always remember that without armour your soldiers will not last long in the field. So use cover wisely and don't expose yourself to an ambush."};
    }
}
