/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DualLinkNode extends IntrusiveNode {
    DualLinkNode secondaryNext;
    DualLinkNode secondaryPrevious;
    static boolean field_k;
    long field_j;
    static IntrusiveDeque field_n;
    static long field_h;
    static String field_o;
    static AccountRequestState field_i;

    final static void c(boolean param0) {
        af.a(-56);
        if (param0) {
          field_i = (AccountRequestState) null;
          if (null == ug.field_y) {
            rg.a(-124);
            hc.h(249);
            wa.a(-45);
            if (!el.a(1)) {
              ck.$cfr$intArgs$b$e683eeaaf5b5(-60);
              return;
            }
            SpriteGeometry.field_q.h(1, 0);
            kc.a(0, -1);
            ck.$cfr$intArgs$b$e683eeaaf5b5(-60);
            return;
          }
          jd.a(ug.field_y, 160);
          rg.a(-124);
          hc.h(249);
          wa.a(-45);
          if (el.a(1)) {
            SpriteGeometry.field_q.h(1, 0);
            kc.a(0, -1);
            ck.$cfr$intArgs$b$e683eeaaf5b5(-60);
            return;
          }
          ck.$cfr$intArgs$b$e683eeaaf5b5(-60);
          return;
        }
        if (null != ug.field_y) {
          jd.a(ug.field_y, 160);
          rg.a(-124);
          hc.h(249);
          wa.a(-45);
          if (!el.a(1)) {
            ck.$cfr$intArgs$b$e683eeaaf5b5(-60);
            return;
          }
          SpriteGeometry.field_q.h(1, 0);
          kc.a(0, -1);
          ck.$cfr$intArgs$b$e683eeaaf5b5(-60);
          return;
        }
        rg.a(-124);
        hc.h(249);
        wa.a(-45);
        if (!el.a(1)) {
          ck.$cfr$intArgs$b$e683eeaaf5b5(-60);
          return;
        }
        SpriteGeometry.field_q.h(1, 0);
        kc.a(0, -1);
        ck.$cfr$intArgs$b$e683eeaaf5b5(-60);
    }

    final static boolean a(byte param0) {
        if (param0 == 81) {
          return MouseWheelInput.field_c == field_i ? true : false;
        }
        field_n = (IntrusiveDeque) null;
        return MouseWheelInput.field_c == field_i ? true : false;
    }

    final static void exitFullscreenFrame(PlatformTaskDispatcher param0, int param1, java.awt.Frame param2) {
        PlatformTask var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        bd var5 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          while (true) {
            var3 = param0.requestFullscreenExit(param1 - 15232, param2);
            while (0 == var3.status) {
              ge.sleepMillis(0, 10L);
            }
            if (1 != var3.status) {
              ge.sleepMillis(0, 100L);
              continue;
            }
            break;
          }
          if (param1 != 15232) {
            var5 = (bd) null;
            DualLinkNode.a(23, (int[]) null, (bd) null);
          }
          param2.setVisible(false);
          param2.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ca.O(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void clearDeclaredStaticReferences(int param0) {
        int var1 = -106 % ((42 - param0) / 35);
        field_i = null;
        field_o = null;
        field_n = null;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        if (!param4) {
          ja.b((byte) -128);
          SoftwareRasterizer.intersectClip(param2, param1, param0, param3);
          return;
        }
        field_o = (String) null;
        ja.b((byte) -128);
        SoftwareRasterizer.intersectClip(param2, param1, param0, param3);
    }

    final void unlinkSecondary(int param0) {
        if (this.secondaryPrevious == null) {
          return;
        }
        this.secondaryPrevious.secondaryNext = this.secondaryNext;
        this.secondaryNext.secondaryPrevious = this.secondaryPrevious;
        this.secondaryNext = null;
        if (param0 == 12) {
          this.secondaryPrevious = null;
          return;
        }
        field_o = (String) null;
        this.secondaryPrevious = null;
    }

    protected DualLinkNode() {
    }

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        var3 = Lexicominos.field_L ? 1 : 0;
        lj.field_b = null;
        re.field_X = null;
        gj.field_t = 0;
        var2 = rc.field_i;
        rc.field_i = DelegatingCanvas.field_c;
        if (param1 == 51) {
          kb.field_b.field_j = 2;
        } else {
          if (50 != param1) {
            kb.field_b.field_j = 1;
            DelegatingCanvas.field_c = var2;
            kb.field_b.field_p = kb.field_b.field_p + 1;
            if (param0 != -51) {
              field_o = (String) null;
            }
            if (kb.field_b.field_p >= 2 &&
              param1 == 51) {
              return 2;
            }
            if (kb.field_b.field_p >= 2 &&
              param1 == 50) {
              return 5;
            }
            if (kb.field_b.field_p >= 4) {
              return 1;
            }
            return -1;
          }
          kb.field_b.field_j = 5;
        }
        DelegatingCanvas.field_c = var2;
        kb.field_b.field_p = kb.field_b.field_p + 1;
        if (param0 != -51) {
          field_o = (String) null;
        }
        if (kb.field_b.field_p >= 2 &&
          param1 == 51) {
          return 2;
        }
        if (kb.field_b.field_p >= 2 &&
          param1 == 50) {
          return 5;
        }
        if (kb.field_b.field_p < 4) {
          return -1;
        }
        return 1;
    }

    final static void a(int param0, int[] param1, bd param2) {
        int var3_int = 0;
        try {
          var3_int = param2.field_h;
          param1[3] = var3_int % 18 + 1;
          var3_int = var3_int / 18;
          param1[2] = 1 + var3_int % 12;
          var3_int = var3_int / param0;
          param1[1] = var3_int % 12;
          param1[0] = var3_int / 12;
          param1[1] = -param1[1] + 11;
        } catch (RuntimeException runtimeException) {
          throw ld.wrapClientException((Throwable) ((Object) runtimeException), "ca.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean d(boolean param0) {
        if (!param0) {
          field_i = (AccountRequestState) null;
          return true;
        }
        return true;
    }

    static {
        field_h = 20000000L;
        field_n = new IntrusiveDeque();
        field_o = "Logging in...";
        field_i = new AccountRequestState();
    }
}
