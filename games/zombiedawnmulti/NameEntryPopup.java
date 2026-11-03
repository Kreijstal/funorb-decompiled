/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NameEntryPopup extends UiComponent {
    static java.awt.Canvas field_Ib;
    private StringBuilder field_Hb;
    private int field_Fb;
    private UiComponent field_Lb;
    static String field_Jb;
    private UiComponent field_Gb;
    static String field_Kb;

    final static void f(boolean param0, int param1) {
        ClickMarker.field_v.c(param0, -1);
        if (param1 != 13758) {
          NameEntryPopup.f(false, 88);
        }
    }

    final static void e(boolean param0, int param1) {
        UiComponent stackIn_6_0 = null;
        boolean stackIn_7_1 = false;
        UiComponent stackIn_10_0 = null;
        boolean stackIn_11_1 = false;
        UiComponent stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        UiComponent stackIn_24_0 = null;
        boolean stackIn_25_1 = false;
        UiComponent stackIn_30_0 = null;
        boolean stackIn_31_1 = false;
        UiComponent stackIn_34_0 = null;
        boolean stackIn_35_1 = false;
        UiComponent stackIn_44_0 = null;
        boolean stackIn_45_1 = false;
        UiComponent stackIn_48_0 = null;
        boolean stackIn_49_1 = false;
        UiComponent stackIn_57_0 = null;
        boolean stackIn_58_1 = false;
        UiComponent stackIn_61_0 = null;
        boolean stackIn_62_1 = false;
        UiComponent stackIn_70_0 = null;
        boolean stackIn_71_1 = false;
        UiComponent stackIn_74_0 = null;
        boolean stackIn_75_1 = false;
        UiComponent stackIn_82_0 = null;
        boolean stackIn_83_1 = false;
        UiComponent stackIn_86_0 = null;
        boolean stackIn_87_1 = false;
        UiComponent stackIn_96_0 = null;
        boolean stackIn_97_1 = false;
        UiComponent stackIn_100_0 = null;
        boolean stackIn_101_1 = false;
        UiComponent stackIn_110_0 = null;
        boolean stackIn_111_1 = false;
        UiComponent stackIn_114_0 = null;
        boolean stackIn_115_1 = false;
        UiComponent stackIn_124_0 = null;
        boolean stackIn_125_1 = false;
        UiComponent stackIn_128_0 = null;
        boolean stackIn_129_1 = false;
        Camera.a(SoftwareRasterizer.width - 640 >> 1, SoftwareRasterizer.height, (byte) 105, 640 + SoftwareRasterizer.width >> 1, 0);
        if (param1 != -7579) {
          NameEntryPopup.c((byte) -88);
          if (0 < JaggrabDownloader.field_h) {
            if (null == vm.field_lb) {
              stackIn_6_0 = qe.field_k;
              stackIn_7_1 = (param0) && (!ee.field_a);
              ((UiComponent) (Object) stackIn_6_0).c(stackIn_7_1, param1 ^ 7578);
              stackIn_10_0 = cm.field_a;
              stackIn_11_1 = (param0) && (!ee.field_a);
              ((UiComponent) (Object) stackIn_10_0).c(stackIn_11_1, -1);
              if (!(HotspotTextWidget.field_Q <= 0) ||
                !(InflaterDecompressor.field_a <= 0)) {
                if (vm.field_lb != null) {
                  vm.field_lb.c(JaggrabDownloader.field_i.field_x, 0);
                }
                stackIn_20_0 = JaggrabDownloader.field_i;
                stackIn_21_1 = (param0) && (!io.field_b);
                ((UiComponent) (Object) stackIn_20_0).c(stackIn_21_1, -1);
                stackIn_24_0 = LevelData.field_a;
                stackIn_25_1 = (param0) && (!io.field_b);
                ((UiComponent) (Object) stackIn_24_0).c(stackIn_25_1, param1 + 7578);
              }
              ql.a(true);
              return;
            }
            vm.field_lb.c(qe.field_k.field_x, 0);
            stackIn_30_0 = qe.field_k;
            stackIn_31_1 = (param0) && (!ee.field_a);
            ((UiComponent) (Object) stackIn_30_0).c(stackIn_31_1, param1 ^ 7578);
            stackIn_34_0 = cm.field_a;
            stackIn_35_1 = (param0) && (!ee.field_a);
            ((UiComponent) (Object) stackIn_34_0).c(stackIn_35_1, -1);
          }
          if (HotspotTextWidget.field_Q > 0) {
            if (vm.field_lb != null) {
              vm.field_lb.c(JaggrabDownloader.field_i.field_x, 0);
            }
            stackIn_57_0 = JaggrabDownloader.field_i;
            stackIn_58_1 = (param0) && (!io.field_b);
            ((UiComponent) (Object) stackIn_57_0).c(stackIn_58_1, -1);
            stackIn_61_0 = LevelData.field_a;
            stackIn_62_1 = (param0) && (!io.field_b);
            ((UiComponent) (Object) stackIn_61_0).c(stackIn_62_1, param1 + 7578);
          } else {
            if (InflaterDecompressor.field_a > 0) {
              if (vm.field_lb != null) {
                vm.field_lb.c(JaggrabDownloader.field_i.field_x, 0);
              }
              stackIn_44_0 = JaggrabDownloader.field_i;
              stackIn_45_1 = (param0) && (!io.field_b);
              ((UiComponent) (Object) stackIn_44_0).c(stackIn_45_1, -1);
              stackIn_48_0 = LevelData.field_a;
              stackIn_49_1 = (param0) && (!io.field_b);
              ((UiComponent) (Object) stackIn_48_0).c(stackIn_49_1, param1 + 7578);
            }
          }
        } else {
          if (0 >= JaggrabDownloader.field_h) {
            if (HotspotTextWidget.field_Q > 0) {
              if (vm.field_lb != null) {
                vm.field_lb.c(JaggrabDownloader.field_i.field_x, 0);
              }
              stackIn_110_0 = JaggrabDownloader.field_i;
              stackIn_111_1 = (param0) && (!io.field_b);
              ((UiComponent) (Object) stackIn_110_0).c(stackIn_111_1, -1);
              stackIn_114_0 = LevelData.field_a;
              stackIn_115_1 = (param0) && (!io.field_b);
              ((UiComponent) (Object) stackIn_114_0).c(stackIn_115_1, param1 + 7578);
            } else {
              if (InflaterDecompressor.field_a > 0) {
                if (vm.field_lb != null) {
                  vm.field_lb.c(JaggrabDownloader.field_i.field_x, 0);
                }
                stackIn_124_0 = JaggrabDownloader.field_i;
                stackIn_125_1 = (param0) && (!io.field_b);
                ((UiComponent) (Object) stackIn_124_0).c(stackIn_125_1, -1);
                stackIn_128_0 = LevelData.field_a;
                stackIn_129_1 = (param0) && (!io.field_b);
                ((UiComponent) (Object) stackIn_128_0).c(stackIn_129_1, param1 + 7578);
              }
            }
          } else {
            if (null != vm.field_lb) {
              vm.field_lb.c(qe.field_k.field_x, 0);
            }
            stackIn_70_0 = qe.field_k;
            stackIn_71_1 = (param0) && (!ee.field_a);
            ((UiComponent) (Object) stackIn_70_0).c(stackIn_71_1, param1 ^ 7578);
            stackIn_74_0 = cm.field_a;
            stackIn_75_1 = (param0) && (!ee.field_a);
            ((UiComponent) (Object) stackIn_74_0).c(stackIn_75_1, -1);
            if (HotspotTextWidget.field_Q > 0) {
              if (vm.field_lb != null) {
                vm.field_lb.c(JaggrabDownloader.field_i.field_x, 0);
              }
              stackIn_82_0 = JaggrabDownloader.field_i;
              stackIn_83_1 = (param0) && (!io.field_b);
              ((UiComponent) (Object) stackIn_82_0).c(stackIn_83_1, -1);
              stackIn_86_0 = LevelData.field_a;
              stackIn_87_1 = (param0) && (!io.field_b);
              ((UiComponent) (Object) stackIn_86_0).c(stackIn_87_1, param1 + 7578);
            } else {
              if (InflaterDecompressor.field_a > 0) {
                if (vm.field_lb != null) {
                  vm.field_lb.c(JaggrabDownloader.field_i.field_x, 0);
                }
                stackIn_96_0 = JaggrabDownloader.field_i;
                stackIn_97_1 = (param0) && (!io.field_b);
                ((UiComponent) (Object) stackIn_96_0).c(stackIn_97_1, -1);
                stackIn_100_0 = LevelData.field_a;
                stackIn_101_1 = (param0) && (!io.field_b);
                ((UiComponent) (Object) stackIn_100_0).c(stackIn_101_1, param1 + 7578);
              }
            }
          }
        }
        ql.a(true);
    }

    final boolean h(int param0) {
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        int var2;
        int var2Lifetime1;
        if (this.field_Fb != 0) {
          return false;
        }
        if (InfectionEvent.field_p != 85) {
          if (this.field_Hb.length() < 12) {
            var2 = Character.toLowerCase(pn.field_d);
            if (32 == var2) {
              var2 = 95;
            }
            if (var2 == 95 &&
              this.field_Hb.length() > 0) {
              discarded$5 = this.field_Hb.append((char) var2);
              if (EmailAvailabilityValidator.a(-24315, (char) var2)) {
                discarded$6 = this.field_Hb.append((char) var2);
              } else {
                if (vh.a((char) var2, (byte) 85)) {
                  discarded$7 = this.field_Hb.append((char) var2);
                }
              }
              if (InfectionEvent.field_p == 84) {
                if (0 >= this.field_Hb.length()) {
                  this.field_Fb = 1;
                } else {
                  this.field_wb = this.field_Hb.toString();
                  this.field_Fb = 2;
                }
              }
              if (param0 < 123) {
                return true;
              }
              if (InfectionEvent.field_p != 13) {
                return true;
              }
              this.field_Fb = 1;
              return true;
            }
            if (EmailAvailabilityValidator.a(-24315, (char) var2)) {
              discarded$8 = this.field_Hb.append((char) var2);
              if (InfectionEvent.field_p == 84) {
                if (0 >= this.field_Hb.length()) {
                  this.field_Fb = 1;
                } else {
                  this.field_wb = this.field_Hb.toString();
                  this.field_Fb = 2;
                }
              }
              if (param0 < 123) {
                return true;
              }
              if (InfectionEvent.field_p == 13) {
                this.field_Fb = 1;
              }
              return true;
            }
            if (vh.a((char) var2, (byte) 85)) {
              discarded$9 = this.field_Hb.append((char) var2);
              if (InfectionEvent.field_p == 84) {
                if (0 >= this.field_Hb.length()) {
                  this.field_Fb = 1;
                } else {
                  this.field_wb = this.field_Hb.toString();
                  this.field_Fb = 2;
                }
              }
              if (param0 < 123) {
                return true;
              }
              if (InfectionEvent.field_p == 13) {
                this.field_Fb = 1;
              }
              return true;
            }
          }
          if (InfectionEvent.field_p != 84) {
            if (param0 < 123) {
              return true;
            }
            if (InfectionEvent.field_p != 13) {
              return true;
            }
            this.field_Fb = 1;
            return true;
          }
          if (0 >= this.field_Hb.length()) {
            this.field_Fb = 1;
          } else {
            this.field_wb = this.field_Hb.toString();
            this.field_Fb = 2;
          }
          if (param0 < 123) {
            return true;
          }
          if (InfectionEvent.field_p == 13) {
            this.field_Fb = 1;
          }
          return true;
        }
        if (0 < this.field_Hb.length()) {
          lf.a(' ', this.field_Hb.length() - 1, 0, this.field_Hb);
        }
        if (this.field_Hb.length() >= 12) {
          if (InfectionEvent.field_p != 84) {
            if (param0 < 123) {
              return true;
            }
            if (InfectionEvent.field_p != 13) {
              return true;
            }
            this.field_Fb = 1;
            return true;
          }
          if (0 >= this.field_Hb.length()) {
            this.field_Fb = 1;
          } else {
            this.field_wb = this.field_Hb.toString();
            this.field_Fb = 2;
          }
          if (param0 < 123) {
            return true;
          }
          if (InfectionEvent.field_p == 13) {
            this.field_Fb = 1;
          }
          return true;
        }
        var2Lifetime1 = Character.toLowerCase(pn.field_d);
        if (32 == var2Lifetime1) {
          var2Lifetime1 = 95;
        }
        if (var2Lifetime1 == 95 &&
          this.field_Hb.length() > 0) {
          discarded$0 = this.field_Hb.append((char) var2Lifetime1);
          if (EmailAvailabilityValidator.a(-24315, (char) var2Lifetime1)) {
            discarded$1 = this.field_Hb.append((char) var2Lifetime1);
          } else {
            if (vh.a((char) var2Lifetime1, (byte) 85)) {
              discarded$2 = this.field_Hb.append((char) var2Lifetime1);
            }
          }
          if (InfectionEvent.field_p == 84) {
            if (0 >= this.field_Hb.length()) {
              this.field_Fb = 1;
            } else {
              this.field_wb = this.field_Hb.toString();
              this.field_Fb = 2;
            }
          }
          if (param0 < 123) {
            return true;
          }
          if (InfectionEvent.field_p == 13) {
            this.field_Fb = 1;
          }
          return true;
        }
        if (EmailAvailabilityValidator.a(-24315, (char) var2Lifetime1)) {
          discarded$3 = this.field_Hb.append((char) var2Lifetime1);
          if (InfectionEvent.field_p == 84) {
            if (0 >= this.field_Hb.length()) {
              this.field_Fb = 1;
            } else {
              this.field_wb = this.field_Hb.toString();
              this.field_Fb = 2;
            }
          }
          if (param0 < 123) {
            return true;
          }
          if (InfectionEvent.field_p != 13) {
            return true;
          }
          this.field_Fb = 1;
          return true;
        }
        if (!vh.a((char) var2Lifetime1, (byte) 85)) {
          if (InfectionEvent.field_p == 84) {
            if (0 >= this.field_Hb.length()) {
              this.field_Fb = 1;
            } else {
              this.field_wb = this.field_Hb.toString();
              this.field_Fb = 2;
            }
          }
          if (param0 < 123) {
            return true;
          }
          if (InfectionEvent.field_p != 13) {
            return true;
          }
          this.field_Fb = 1;
          return true;
        }
        discarded$4 = this.field_Hb.append((char) var2Lifetime1);
        if (InfectionEvent.field_p != 84) {
          if (param0 < 123) {
            return true;
          }
          if (InfectionEvent.field_p != 13) {
            return true;
          }
          this.field_Fb = 1;
          return true;
        }
        if (0 >= this.field_Hb.length()) {
          this.field_Fb = 1;
          if (param0 < 123) {
            return true;
          }
          if (InfectionEvent.field_p != 13) {
            return true;
          }
          this.field_Fb = 1;
          return true;
        }
        this.field_wb = this.field_Hb.toString();
        this.field_Fb = 2;
        if (param0 < 123) {
          return true;
        }
        if (InfectionEvent.field_p == 13) {
          this.field_Fb = 1;
        }
        return true;
    }

    public static void c(byte param0) {
        field_Ib = null;
        if (param0 < 4) {
          return;
        }
        field_Jb = null;
        field_Kb = null;
    }

    final int a(byte param0, boolean param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        this.a(-11838, param1);
        if (!param1) {
          this.field_Gb.field_wb = this.field_Hb.toString();
          if (param0 < 84) {
            this.field_Hb = (StringBuilder) null;
            if (param1 &&
              kd.field_b != 0 &&
              this.field_T == 0) {
              this.field_Fb = 1;
            }
            return this.field_Fb;
          }
          if (!param1) {
            return this.field_Fb;
          }
          if (kd.field_b == 0) {
            return this.field_Fb;
          }
          if (this.field_T != 0) {
            return this.field_Fb;
          }
          this.field_Fb = 1;
          return this.field_Fb;
        }
        while (true) {
          if (!MusicPatchPcmStream.c(-1)) {
            this.field_Gb.field_wb = this.field_Hb.toString();
            if (param0 < 84) {
              this.field_Hb = (StringBuilder) null;
              if (param1 &&
                kd.field_b != 0 &&
                this.field_T == 0) {
                this.field_Fb = 1;
              }
              return this.field_Fb;
            }
            if (!param1) {
              return this.field_Fb;
            }
            if (kd.field_b == 0) {
              return this.field_Fb;
            }
            if (this.field_T != 0) {
              return this.field_Fb;
            }
            this.field_Fb = 1;
            return this.field_Fb;
          }
          if (InfectionEvent.field_p == 85 &&
            this.field_Hb.length() > 0) {
            lf.a(' ', this.field_Hb.length() - 1, 0, this.field_Hb);
          }
          if (ck.a(pn.field_d, -1, (CharSequence) ((Object) this.field_Hb))) {
            discarded$0 = this.field_Hb.append(pn.field_d);
          } else {
            if (0 == this.field_Hb.length() &&
              pn.field_d == 91) {
              discarded$1 = this.field_Hb.append(pn.field_d);
            } else {
              if (this.field_Hb.length() == 1 &&
                pn.field_d == 35) {
                discarded$2 = this.field_Hb.append(pn.field_d);
              } else {
                if (pn.field_d == 93) {
                  discarded$3 = this.field_Hb.append(pn.field_d);
                }
              }
            }
          }
          if (InfectionEvent.field_p != 84) {
            if (InfectionEvent.field_p == 13) {
              return 1;
            }
            continue;
          }
          break;
        }
        if (this.field_Hb.length() <= 0) {
          return 1;
        }
        this.field_wb = this.field_Hb.toString();
        return 2;
    }

    NameEntryPopup(int param0, int param1, int param2, int param3, String param4, UiComponent param5, UiComponent param6, UiComponent param7) {
        super(0L, param5);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        this.field_Fb = 0;
        try {
          this.field_Lb = new UiComponent(0L, param6, param4);
          this.a((byte) 50, this.field_Lb);
          this.field_Gb = new UiComponent(0L, param7);
          this.field_Gb.field_M = 16764006;
          this.a((byte) 50, this.field_Gb);
          this.field_Gb.field_vb = "|";
          this.field_Hb = new StringBuilder(12);
          var9_int = this.field_Lb.e(0);
          this.field_Lb.setBounds(jk.field_f, 3, var9_int, 5, -3344);
          this.field_Gb.setBounds(jk.field_f, 3 + jk.field_f, var9_int, 5, -3344);
          var10 = var9_int + 5 + 5;
          var11 = 3 + jk.field_f * 2 + 3;
          var12 = MatchingTextValidator.a(param0, (byte) 116, var10, param2);
          var13 = IntrusiveNode.a(true, param1, param3, var11);
          this.setBounds(var11, var13, var10, var12, -3344);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_5_0 = var9;
          stackIn_5_1 = new StringBuilder().append("dk.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param5 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param6 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param7 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_Jb = "Find opponents";
        field_Kb = "Suggest muting this player";
    }
}
