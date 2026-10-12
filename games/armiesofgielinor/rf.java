/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    private ResourceArchive field_f;
    static String field_e;
    static je field_d;
    private ri field_b;
    private ResourceArchive field_c;
    static String field_a;

    final static boolean c(int param0) {
        if (param0 <= -97) {
          return !se.field_g.a((byte) 125) ? true : false;
        }
        field_a = (String) null;
        return !se.field_g.a((byte) 125) ? true : false;
    }

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        if (param0 >= -107) {
          return;
        }
        field_a = null;
    }

    final static boolean a(int param0) {
        if (param0 != 27875) {
          field_d = (je) null;
          if (!DamageEvent.g(81)) {
            return df.field_M <= 0 ? true : false;
          }
          return true;
        }
        if (DamageEvent.g(81)) {
          return true;
        }
        if (df.field_M > 0) {
          return false;
        }
        return true;
    }

    final static void b(byte param0) {
        kw.field_M[46] = 72;
        kw.field_M[61] = 27;
        kw.field_M[192] = 28;
        kw.field_M[222] = 58;
        kw.field_M[520] = 59;
        kw.field_M[44] = 71;
        kw.field_M[93] = 43;
        kw.field_M[45] = 26;
        kw.field_M[92] = 74;
        kw.field_M[59] = 57;
        kw.field_M[91] = 42;
        if (param0 >= 109) {
          kw.field_M[47] = 73;
          return;
        }
        field_d = (je) null;
        kw.field_M[47] = 73;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param0 != 32767) {
                return;
              }
              var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
              param1.getAppletContext().showDocument(ck.a(-3780, var2, param1), "_top");
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
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("rf.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, au param1) {
        au var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        java.applet.Applet var4 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          param1.unlink(76);
          var2 = (au) (qc.field_g.first((byte) 92));
          if (param0 > -66) {
            var4 = (java.applet.Applet) null;
            rf.a(-6, (java.applet.Applet) null);
          }
          while (var2 != null) {
            if (var2.a((byte) -76, param1)) {
              var2 = (au) (qc.field_g.next((byte) 123));
              continue;
            }
            break;
          }
          if (var2 == null) {
            qc.field_g.addLast((byte) -119, (IntrusiveNode) (param1));
            return;
          }
          stackIn_9_0 = -123;
          fj.$cfr$intArgs$a$f94c566f195c(stackIn_9_0, param1, var2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_13_0 = var2_ref;
          stackIn_13_1 = new StringBuilder().append("rf.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        fg var1_ref = null;
        Object var1 = null;
        fg var1_refLifetime1;
        if (param0 != -18862) {
          field_a = (String) null;
          var1_ref = (fg) (ParasiteEvent.field_y.popLast((byte) -125));
          if (var1_ref == null) {
            throw new IllegalStateException();
          }
          SoftwareRaster.a(var1_ref.field_t, var1_ref.field_u, var1_ref.field_q);
          SoftwareRaster.f(var1_ref.field_p, var1_ref.field_r, var1_ref.field_s, var1_ref.field_o);
          var1_ref.field_t = null;
          EventPresenter.field_q.addLast((byte) -119, (IntrusiveNode) (var1_ref));
          return;
        }
        var1_refLifetime1 = (fg) (ParasiteEvent.field_y.popLast((byte) -125));
        if (var1_refLifetime1 == null) {
          throw new IllegalStateException();
        }
        SoftwareRaster.a(var1_refLifetime1.field_t, var1_refLifetime1.field_u, var1_refLifetime1.field_q);
        SoftwareRaster.f(var1_refLifetime1.field_p, var1_refLifetime1.field_r, var1_refLifetime1.field_s, var1_refLifetime1.field_o);
        var1_refLifetime1.field_t = null;
        EventPresenter.field_q.addLast((byte) -119, (IntrusiveNode) (var1_refLifetime1));
    }

    final ar a(int param0, int param1) {
        byte[] var5 = null;
        int var4 = 112 % ((-78 - param1) / 40);
        ar var3 = (ar) (this.field_b.a((long)param0, (byte) 127));
        if (var3 != null) {
          return var3;
        }
        if (32768 <= param0) {
          var5 = this.field_c.getFile((byte) 99, 32767 & param0, 1);
        } else {
          var5 = this.field_f.getFile((byte) 118, param0, 1);
        }
        ar var6 = new ar();
        if (var5 != null) {
          var6.a(new PacketBuffer(var5), (byte) 91);
          if (32768 <= param0) {
            var6.a(true);
            this.field_b.a(var6, 100, (long)param0);
            return var6;
          }
          this.field_b.a(var6, 100, (long)param0);
          return var6;
        }
        if (32768 > param0) {
          this.field_b.a(var6, 100, (long)param0);
          return var6;
        }
        var6.a(true);
        this.field_b.a(var6, 100, (long)param0);
        return var6;
    }

    rf(int param0, ResourceArchive param1, ResourceArchive param2, gj param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_b = new ri(64);
        try {
          this.field_c = param2;
          this.field_f = param1;
          if (null != this.field_f) {
            this.field_f.getFileCapacity(1, -2);
          }
          if (this.field_c == null) {
            return;
          }
          this.field_c.getFileCapacity(1, -2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("rf.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_e = "As a hero of Gielinor, you must choose which path to follow: align with your chosen god, or remain neutral in your devotions.";
        field_a = "Loading fonts";
    }
}
