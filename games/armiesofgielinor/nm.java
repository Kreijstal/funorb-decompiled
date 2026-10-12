/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm extends PcmStream {
    static int field_z;
    private ih field_r;
    private boolean field_F;
    private int field_x;
    private int field_C;
    ih field_y;
    private boolean field_B;
    static int deliveredOpcode;
    static String field_u;
    ih field_w;
    ih field_D;
    private int[] field_E;
    private um field_p;
    private um field_q;
    private int[] field_t;
    static ResourceArchive field_s;
    private int field_v;
    private int field_G;
    private um field_A;

    final void render(int[] output, int outputOffset, int frameCount) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_32_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.field_x <= 0) {
            this.skip(frameCount);
            return;
          }
          if (this.field_F) {
            if (this.field_C > 0 &&
              !this.field_w.g(11899)) {
              this.field_F = false;
              this.field_p = null;
              this.field_C = -this.field_C;
            } else {
              if (this.field_C < 0 &&
                !this.field_D.g(11899)) {
                this.field_F = false;
                this.field_C = -this.field_C;
                this.field_A = null;
              }
            }
          }
          var4_int = (this.field_G >> 12) * this.field_x / 256;
          var5 = -var4_int + this.field_x;
          if (this.field_C != 0) {
            this.field_G = this.field_G + frameCount * this.field_C;
            if (1048576 > this.field_G) {
              if (this.field_G <= 0) {
                this.field_G = 0;
                if (!this.field_F) {
                  this.field_C = 0;
                  if (!this.field_B) {
                    if (this.field_p != null) {
                      this.field_w.j(7);
                    }
                    this.field_p = null;
                  }
                }
              }
            } else {
              this.field_G = 1048576;
              if (!this.field_F) {
                this.field_C = 0;
                if (!this.field_B) {
                  if (null != this.field_A) {
                    this.field_D.j(7);
                  }
                  this.field_A = null;
                }
              }
            }
          }
          if (!PcmPlayer.stereo) {
            stackIn_32_0 = frameCount;
          } else {
            stackIn_32_0 = frameCount << 1;
          }
          var6 = stackIn_32_0;
          if (this.field_v < 256 && (this.field_p != null ||
            null != this.field_A)) {
            if (var4_int != 256) {
              if (var5 != 256) {
                if (null != this.field_t &&
                  var6 <= this.field_t.length) {
                  vm.a(this.field_t, 0, var6);
                  vm.a(this.field_E, 0, var6);
                } else {
                  this.field_t = new int[var6];
                  this.field_E = new int[var6];
                }
                this.field_w.render(this.field_t, 0, frameCount);
                this.field_D.render(this.field_E, 0, frameCount);
                if (!PcmPlayer.stereo) {
                  stackIn_48_0 = outputOffset;
                } else {
                  localTemp$0 = outputOffset << 1;
                  outputOffset = localTemp$0;
                  stackIn_48_0 = localTemp$0;
                }
                var7 = stackIn_48_0;
                for (var8 = 0; var8 < var6; var8++) {
                  output[var7 + var8] = output[var7 + var8] + (var5 * this.field_E[var8] + var4_int * this.field_t[var8] >> 8);
                }
              } else {
                this.field_D.render(output, outputOffset, frameCount);
              }
            } else {
              this.field_w.render(output, outputOffset, frameCount);
            }
          }
          if (this.field_q != null) {
            if (this.field_v == 0) {
              return;
            }
            if (this.field_t != null &&
              var6 <= this.field_t.length) {
              vm.a(this.field_t, 0, var6);
            } else {
              this.field_E = new int[var6];
              this.field_t = new int[var6];
            }
            this.field_r.render(this.field_t, 0, frameCount);
            if (!PcmPlayer.stereo) {
              stackIn_62_0 = outputOffset;
            } else {
              localTemp$1 = outputOffset << 1;
              outputOffset = localTemp$1;
              stackIn_62_0 = localTemp$1;
            }
            var7Lifetime1 = stackIn_62_0;
            var8Lifetime1 = this.field_x * this.field_v / 256;
            var9 = -var8Lifetime1 + this.field_x;
            for (var10 = 0; var10 < var6; var10++) {
              output[var10 + var7Lifetime1] = output[var10 + var7Lifetime1] * var9 + var8Lifetime1 * this.field_t[var10] >> 8;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_68_0 = var4;
          stackIn_68_1 = new StringBuilder().append("nm.E(");
          if (output == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(outputOffset).append(',').append(frameCount).append(')').toString());
        }
    }

    final static void a(um param0, boolean param1, int param2, byte param3) {
        Object var4 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          if (param3 != 41) {
            field_u = (String) null;
          }
          if (lk.field_e != null) {
            bk.a(param2, 1048576, param0, param3 + 20566, param1);
          }
          if (null != LobbyRoom.field_Kb) {
            var4 = l.field_a;
            synchronized (var4) {
              LobbyRoom.field_Kb.a(param2, -1, (byte) -91);
              if (MapLayout.field_u == param0) {
                return;
              }
              LobbyRoom.field_Kb.j(7);
              l.field_a.c();
              MapLayout.field_u = param0;
              if (MapLayout.field_u != null) {
                LobbyRoom.field_Kb.a(2, param1, MapLayout.field_u);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_20_0 = var4_ref;
          stackIn_20_1 = new StringBuilder().append("nm.N(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final PcmStream firstSubStream() {
        return null;
    }

    final static boolean a(int param0, boolean param1) {
        if (!param1) {
          return false;
        }
        return param0 >= 0 ? true : false;
    }

    final synchronized void skip(int frameCount) {
        int var3;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.field_G > 0 &&
          this.field_p != null) {
          this.field_w.skip(frameCount);
        }
        if (this.field_G < 1048576 &&
          this.field_A != null) {
          this.field_D.skip(frameCount);
        }
        if (this.field_v > 0 &&
          null != this.field_q) {
          this.field_r.skip(frameCount);
        }
        if (this.field_F) {
          if (this.field_C > 0) {
            if (!this.field_w.g(11899)) {
              this.field_F = false;
              this.field_C = -this.field_C;
              this.field_p = null;
            } else {
              if (this.field_C < 0 &&
                !this.field_D.g(11899)) {
                this.field_F = false;
                this.field_C = -this.field_C;
                this.field_A = null;
              }
            }
          } else {
            if (this.field_C < 0 &&
              !this.field_D.g(11899)) {
              this.field_F = false;
              this.field_C = -this.field_C;
              this.field_A = null;
            }
          }
        }
        if (this.field_C != 0) {
          this.field_G = this.field_G + this.field_C * frameCount;
          if (this.field_G < 1048576) {
            if (this.field_G <= 0) {
              this.field_G = 0;
              if (!this.field_F) {
                this.field_C = 0;
                if (!this.field_B) {
                  if (null != this.field_p) {
                    this.field_w.j(7);
                  }
                  this.field_p = null;
                }
              }
            }
          } else {
            this.field_G = 1048576;
            if (!this.field_F) {
              this.field_C = 0;
              if (!this.field_B) {
                if (this.field_A != null) {
                  this.field_D.j(7);
                }
                this.field_A = null;
              }
            }
          }
        }
    }

    final synchronized void a(int param0, boolean param1, um param2, int param3, int param4, int param5) {
        boolean stackIn_19_1 = false;
        int stackIn_33_0 = 0;
        ih stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        boolean stackIn_44_2 = false;
        ih stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        boolean stackIn_53_2 = false;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        ih var9 = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.field_F &&
            param1) {
            if (this.field_C <= 0) {
              if (null != this.field_A) {
                this.field_D.j(7);
              }
              this.field_A = param2;
              if (param2 != null) {
                this.field_D.a(2, false, param2);
                this.a(-1, this.field_D, param5, param0);
              }
            } else {
              if (this.field_p != null) {
                this.field_w.j(7);
              }
              this.field_p = param2;
              if (param2 != null) {
                this.field_w.a(2, false, param2);
                this.a(-1, this.field_w, param5, param0);
              }
            }
            return;
          }
          stackIn_19_1 = (param1);
          this.field_F = stackIn_19_1;
          if (param2 == this.field_p) {
            this.field_C = param4;
            this.a(-1, this.field_w, param5, param0);
            return;
          }
          if (param2 == this.field_A) {
            this.field_C = -param4;
            this.a(-1, this.field_D, param5, param0);
            return;
          }
          if (param3 != -1) {
            var9 = (ih) null;
            this.a(-25, (ih) null, 43, -18);
          }
          if (this.field_p == null) {
            var7_int = 1;
          } else {
            if (null == this.field_A) {
              var7_int = 0;
            } else {
              stackIn_33_0 = (this.field_G >= 524288) ? 0 : 1;
              var7_int = stackIn_33_0;
            }
          }
          if (var7_int != 0) {
            if (this.field_p != null) {
              this.field_w.j(7);
            }
            this.field_p = param2;
            if (param2 != null) {
              stackIn_52_0 = this.field_w;
              stackIn_52_1 = 2;
              stackIn_53_2 = !(param1);
              ((ih) (Object) stackIn_52_0).a(stackIn_52_1, stackIn_53_2, param2);
              this.a(param3 + 0, this.field_w, param5, param0);
            }
            this.field_C = param4;
          } else {
            if (null != this.field_A) {
              this.field_D.j(7);
            }
            this.field_A = param2;
            if (param2 != null) {
              stackIn_43_0 = this.field_D;
              stackIn_43_1 = param3 + 3;
              stackIn_44_2 = !(param1);
              ((ih) (Object) stackIn_43_0).a(stackIn_43_1, stackIn_44_2, param2);
              this.a(param3 ^ 0, this.field_D, param5, param0);
            }
            this.field_C = -param4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_58_0 = var7;
          stackIn_58_1 = new StringBuilder().append("nm.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_58_0), ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final PcmStream nextSubStream() {
        return null;
    }

    final synchronized void b(int param0, int param1) {
        this.field_x = param0;
        int var3 = 74 % ((param1 + 65) / 46);
    }

    final synchronized int getSchedulingCost() {
        return 2;
    }

    private final void a(int param0, ih param1, ih param2) {
        try {
          this.field_D = param2;
          this.field_w = param1;
          this.field_G = 1048576;
          this.field_y = this.field_w;
          if (param0 < 36) {
            ih var5 = (ih) null;
            this.a(-114, (ih) null, (ih) null);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "nm.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(int param0) {
        if (param0 != 256) {
          field_u = (String) null;
        }
        field_u = null;
        field_s = null;
    }

    private final void a(int param0, ih param1, int param2, int param3) {
        try {
          this.field_y = param1;
          param1.a(param3, param0, (byte) -55);
          param1.c(param2, param0 ^ 34);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "nm.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        ClientUiComponent stackIn_6_0 = null;
        boolean stackIn_7_1 = false;
        ClientUiComponent stackIn_10_0 = null;
        boolean stackIn_11_1 = false;
        ClientUiComponent stackIn_23_0 = null;
        boolean stackIn_24_1 = false;
        ClientUiComponent stackIn_27_0 = null;
        boolean stackIn_28_1 = false;
        CampaignUnitOverride.a(-640 + SoftwareRaster.width >> 1, 640 + SoftwareRaster.width >> 1, SoftwareRaster.height, 0, (byte) 91);
        if (gk.field_J > 0) {
          if (null != dh.field_k) {
            dh.field_k.f(no.field_T.x, 0);
          }
          stackIn_6_0 = no.field_T;
          stackIn_7_1 = (param1) && (!bw.field_g);
          ((ClientUiComponent) (Object) stackIn_6_0).draw(stackIn_7_1, 20);
          stackIn_10_0 = ov.field_i;
          stackIn_11_1 = (param1) && (!bw.field_g);
          ((ClientUiComponent) (Object) stackIn_10_0).draw(stackIn_11_1, 20);
        }
        if (param0 != 95) {
          return;
        }
        if (!(0 >= PreparedAction.field_r) ||
          !(InstructionsPanel.field_D <= 0)) {
          if (dh.field_k != null) {
            dh.field_k.f(lk.field_a.x, 0);
          }
          stackIn_23_0 = lk.field_a;
          stackIn_24_1 = (param1) && (!vk.field_f);
          ((ClientUiComponent) (Object) stackIn_23_0).draw(stackIn_24_1, 20);
          stackIn_27_0 = pd.field_c;
          stackIn_28_1 = (param1) && (!vk.field_f);
          ((ClientUiComponent) (Object) stackIn_27_0).draw(stackIn_28_1, 20);
        }
        QuickChatPhraseRepository.popRasterState(-18862);
    }

    final static li a(int param0, int param1, byte[] param2) {
        li var3 = null;
        RuntimeException var3_ref = null;
        li stackIn_2_0 = null;
        li stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new li(param2);
          s.field_e.addLast((byte) -119, (IntrusiveNode) (var3));
          DeathEvent.a(var3, param1, 25522);
          if (param0 == 0) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          stackIn_2_0 = (li) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("nm.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    nm(ih param0, ih param1) {
        this.field_B = false;
        this.field_x = 256;
        this.field_v = 0;
        try {
          this.a(121, param0, param1);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "nm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_u = "The following settings need to be changed:  ";
        deliveredOpcode = -1;
    }
}
