/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextInputValidator extends ib implements ga {
    static uj field_h;
    static double field_f;
    private dj validatedInput;

    final static void a(byte param0, boolean param1) {
        if (param0 < 102) {
            return;
        }
        b.a(false, param1, false);
    }

    final lh currentValidationState(int guard) {
        if (guard != 32) {
            return (lh) null;
        }
        return this.validationStateForText(-257, this.validatedInput.field_s);
    }

    public final boolean a(int param0) {
        if (param0 != -26556) {
            String var3 = (String) null;
            this.validationMessageForText(-33, (String) null);
            if (this.validatedInput.field_s != null) {
                return this.validatedInput.field_s.length() == 0 ? true : false;
            }
            return true;
        }
        if (this.validatedInput.field_s == null) {
            return true;
        }
        if (this.validatedInput.field_s.length() != 0) {
            return false;
        }
        return true;
    }

    public final void a(dj param0, int param1) {
        try {
            if (param1 != -18649) {
                this.validatedInput = (dj) null;
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "q.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract String validationMessageForText(int guard, String candidateText);

    final static boolean a(char param0, byte param1) {
        if (!(!Character.isISOControl(param0))) {
            return false;
        }
        if (pf.a(-123, param0)) {
            return true;
        }
        if (param0 == 45) {
            return true;
        }
        if (param0 == 160) {
            return true;
        }
        if (32 == param0) {
            return true;
        }
        if (param0 == 95) {
            return true;
        }
        if (param1 > 88) {
            return false;
        }
        return false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, PlatformTaskDispatcher param5, String param6, int param7, int param8) {
        try {
            ag.field_l = param7;
            bm.field_u = param3;
            GameplaySession.field_z = param6;
            hc.field_T = param0;
            pc.field_C = param1;
            vg.field_a = param2;
            ph.field_i = param5;
            if (param4 != -23949) {
                field_f = -0.8279321027589008;
            }
            ij.field_W = param8;
            wg.field_i = (ji) ((Object) new kk());
            cl.field_c = new uf(param5);
            gb.field_b = new em(wg.field_i, cl.field_c);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "q.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    public final void a(dj param0, byte param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 74) {
            this.a(-117);
            this.b(-28133);
          } else {
            this.b(-28133);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var3);
          stackIn_7_1 = new StringBuilder().append("q.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          va.field_d = false;
          ii.field_a = false;
          if (null != Geoblox.field_y) {
            if (Geoblox.field_y.field_I) {
              if (8 == param1) {
                param1 = 2;
                if (!cf.field_i) {
                  param2 = mi.invalidUserOrPasswordText;
                } else {
                  param2 = DualLinkNode.invalidPasswordText;
                }
                ml.field_t.a(b.field_a, 0);
              }
              var3_int = 1;
              if (param1 == 10) {
                MatchingTextValidator.c((byte) -4);
                var3_int = 0;
              }
              if (var3_int != 0) {
                if (ii.field_a) {
                  param2 = wj.a(mi.connectionLostWithReasonText, new String[]{param2}, (byte) -25);
                }
                if (mi.field_I) {
                  param2 = kf.pleaseTryAgainText;
                }
                Geoblox.field_y.a(param1, param0 + 19686, param2);
              }
              if (param1 != 256) {
                if (param1 != 10) {
                  if (!cf.field_i) {
                    ml.field_t.i(-119);
                  }
                }
              }
            }
          }
          if (param0 == 124) {
            return;
          }
          var4 = (String) null;
          TextInputValidator.a(-94, -21, 56, -5, 62, (PlatformTaskDispatcher) null, (String) null, -54, -101);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = (RuntimeException) (var3);
          stackIn_29_1 = new StringBuilder().append("q.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static CoverageBitmapFont a(rh param0, int param1, String param2, String param3, rh param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        CoverageBitmapFont stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            var7 = (String) null;
            TextInputValidator.a((byte) 108, 111, (String) null);
          }
          var5_int = param4.a((byte) 126, param3);
          var6 = param4.a(param2, param1 - 69, var5_int);
          stackIn_3_0 = ea.a(param4, (byte) -127, param0, var6, var5_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (var5);
          stackIn_6_1 = new StringBuilder().append("q.R(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    abstract lh validationStateForText(int guard, String candidateText);

    final String currentValidationMessage(byte guard) {
        if (guard == -103) {
            return this.validationMessageForText(422, this.validatedInput.field_s);
        }
        this.validatedInput = (dj) null;
        return this.validationMessageForText(422, this.validatedInput.field_s);
    }

    public static void f(int param0) {
        field_h = null;
        if (param0 != 1) {
            field_h = (uj) null;
        }
    }

    TextInputValidator(dj validatedInput) {
        try {
            this.validatedInput = validatedInput;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "q.<init>(" + (validatedInput != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = new uj();
        field_f = Math.atan2(1.0, 0.0);
    }
}
