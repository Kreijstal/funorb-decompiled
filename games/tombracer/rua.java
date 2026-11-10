/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rua extends MessageDialog implements ButtonListener {
    static String field_jb;
    static String field_hb;
    static jea field_gb;
    private AccountRegistrationPanel field_fb;
    private boolean field_eb;
    private boolean field_ib;

    public final void onButtonActivated(int param0, int param1, FocusableWidget param2, int param3, byte param4) {
        if (param4 < 44) {
          jua var7 = (jua) null;
          this.a(-122, true, (jua) null);
        }
        if (this.field_ib) {
          LegacyOpenGlFlowingWaterEffect.a(true, false, (byte) 101);
          return;
        }
        try {
          SingleChildWidget.d(-7694);
          this.i((byte) 13);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "rua.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    rua(jta param0, AccountRegistrationPanel param1) {
        super(param0, ft.field_c, dsa.field_d, false, false);
        try {
          this.field_fb = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "rua.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void h(boolean param0) {
        this.a(7, param0, doa.a(qp.field_v, 248, (byte) 114));
    }

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = 0;
          var3 = 114 % ((param1 - 34) / 44);
          while (true) {
            if (var2_int >= 4) {
              stackIn_8_0 = "Learn to spell";
              return stackIn_8_0;
            }
            if (!rf.field_c[var2_int].equalsIgnoreCase(param0)) {
              var2_int++;
              continue;
            }
            break;
          }
          TripBeamComponent.b(1, var2_int);
          stackIn_5_0 = "Playing track " + param0;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("rua.MB(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        field_jb = null;
        if (param0) {
          field_hb = (String) null;
        }
        field_hb = null;
        field_gb = null;
    }

    private final void a(int param0, boolean param1, jua param2) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        sr var5 = null;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          this.field_eb = true;
          if (!param2.field_e) {
            if (param2.field_c == null) {
              var4 = param2.field_b;
              if (param2.field_f == 248) {
                if (!param1) {
                  jp.a(false);
                }
                this.field_ib = true;
                var4 = qp.field_v;
              }
            } else {
              var4 = qma.field_f;
              if (this.field_fb != null) {
                this.field_fb.onMoreSuggestionsRequested(10000536);
              }
            }
          } else {
            var4 = ScrollControlWidget.field_K;
          }
          var5 = new sr((MessageDialog) (this), ft.field_c, var4);
          if (param0 != 7) {
            return;
          }
          if (param2.field_e) {
            if (param2.field_a) {
              this.a(param0 ^ 86, new pg(this));
              return;
            }
            var5.a(aua.field_d, (byte) -102, (WidgetListener) (this));
          } else {
            if (!this.field_ib) {
              if (param2.field_f != 5) {
                var5.a(KeyLockBehaviour.field_o, -1, 40);
              } else {
                var5.a(InvertOperator.field_n, 11, 102);
                var5.a(ControllerLocomotor.field_q, 17, 59);
              }
            } else {
              var5.a(aua.field_d, (byte) -102, (WidgetListener) (this));
            }
            if (param2.field_f != 3) {
              if (param2.field_f == 6) {
                var5.a(RenderLayer.field_a, 9, -126);
              }
            } else {
              var5.a(MovingWallComponent.field_M, 7, 58);
            }
          }
          this.a(param0 + 80, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_31_0 = var4_ref;
          stackIn_31_1 = new StringBuilder().append("rua.OB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final static GraphicsToolkit a(boolean param0, d param1, ResourceArchive param2, java.awt.Canvas param3, int param4) {
        RuntimeException var5 = null;
        long var6 = 0L;
        HardwareOpenGlToolkit var8 = null;
        jaggl.OpenGL var9 = null;
        GraphicsToolkit stackIn_8_0 = null;
        HardwareOpenGlToolkit stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!mja.a((byte) -50)) {
            throw new RuntimeException("");
          }
          if (!StringCursor.a("jaggl", 480)) {
            throw new RuntimeException("");
          }
          var9 = new jaggl.OpenGL();
          var6 = var9.init(param3, 8, 8, 8, 24, 0, param4);
          if (var6 == 0L) {
            throw new RuntimeException("");
          }
          if (!param0) {
            stackIn_8_0 = (GraphicsToolkit) null;
            return stackIn_8_0;
          }
          var8 = new HardwareOpenGlToolkit(var9, param3, var6, param1, param2, param4);
          var8.initializeHardwareResources(-74);
          stackIn_10_0 = var8;
          return (GraphicsToolkit) ((Object) stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("rua.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(int param0) {
        jua var2 = null;
        if (this.field_B &&
          !this.field_eb) {
          var2 = dqa.takeRegistrationResponse(3239);
          if (var2 != null) {
            this.a(7, false, var2);
          }
        }
        if (param0 < 126) {
          this.field_fb = (AccountRegistrationPanel) null;
        }
        return super.a(127);
    }

    static {
        field_hb = "Mobile Lindemann totems";
        field_jb = "Breaking real-world laws";
    }
}
