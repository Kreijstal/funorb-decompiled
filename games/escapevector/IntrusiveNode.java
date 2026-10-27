/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    static java.applet.Applet field_c;
    IntrusiveNode previous;
    long key;
    static String field_a;
    IntrusiveNode next;
    static String field_f;

    final static boolean b(int param0) {
        if (param0 != 12) {
          return false;
        }
        if (null == pn.field_pb) {
          return false;
        }
        if (pn.field_pb.n(0) == null) {
          return false;
        }
        return true;
    }

    final boolean isLinked(byte guard) {
        if (guard != 48) {
          IntrusiveNode.c(-37);
          if (this.previous != null) {
            return true;
          }
          return false;
        }
        if (this.previous != null) {
          return true;
        }
        return false;
    }

    final static void a(int param0, int param1, cc param2) {
        c var5 = om.field_c;
        var5.a(param1, true);
        var5.position = var5.position + 1;
        int var4 = var5.position;
        if (param0 > -20) {
          return;
        }
        try {
          var5.f(1, -123);
          var5.f(param2.field_i, -123);
          var5.d(12680, param2.field_m);
          var5.a((byte) 126, param2.field_n);
          var5.a((byte) 127, param2.field_h);
          var5.a((byte) 123, param2.field_o);
          var5.a((byte) 125, param2.field_g);
          var5.c(var4, -61);
          var5.e(118, -var4 + var5.position);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "hg.WA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static ui[] a(c param0, int param1) {
        String stackIn_19_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          int var2_int = param0.j(8, 8);
          if (0 < var2_int) {
            Object stackIn_3_0 = null;
            return (ui[]) (stackIn_3_0);
          }
          int var3 = param0.j(12, 8);
          ui[] var4 = new ui[var3];
          for (int var5 = 0; var3 > var5; var5++) {
            if (da.a(param0, (byte) -116)) {
              ui var6 = new ui();
              param0.j(24, param1 ^ 22186);
              param0.j(24, 8);
              var6.field_c = param0.j(24, param1 ^ 22186);
              param0.j(9, 8);
              param0.j(12, param1 ^ 22186);
              param0.j(12, 8);
              param0.j(12, 8);
              var4[var5] = var6;
            } else {
              int var6_int = param0.j(wf.a(var5 - 1, 24787), 8);
              var4[var5] = var4[var6_int];
            }
          }
          if (param1 == 22178) {
            ui[] stackIn_15_0 = var4;
            return stackIn_15_0;
          }
          ui[] stackIn_13_0 = (ui[]) null;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var2;
          StringBuilder stackIn_18_1 = new StringBuilder().append("hg.SA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_c = null;
        field_a = null;
        field_f = null;
        if (param0 > -26) {
          IntrusiveNode.c(6);
        }
    }

    final static void a(int param0) {
        if (param0 != 12) {
          IntrusiveNode.c(-66);
        }
    }

    final void unlink(byte guard) {
        if (this.previous == null) {
          return;
        }
        if (guard <= -8) {
          this.previous.next = this.next;
          this.next.previous = this.previous;
          this.next = null;
          this.previous = null;
          return;
        }
        IntrusiveNode.b(-128);
        this.previous.next = this.next;
        this.next.previous = this.previous;
        this.next = null;
        this.previous = null;
    }

    static {
        field_f = "Targets: ";
        field_a = "Create a free account to start using this feature";
    }
}
