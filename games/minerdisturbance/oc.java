/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends hn {
    private String field_k;
    private String field_g;
    static int[] field_e;
    static int field_f;
    static bg field_i;
    static String field_h;
    static int[] field_l;
    static String field_j;

    final ec b(int param0) {
        if (param0 != 0) {
          field_j = (String) null;
        }
        return hk.field_i;
    }

    final static void f(int param0) {
        int stackIn_13_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_60_0 = 0;
        boolean stackIn_73_0 = false;
        Throwable decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Exception var5 = null;
        int var6 = 0;
        int var1_intLifetime1;
        var6 = MinerDisturbance.field_ab;
        try {
          if (fl.field_d) {
            return;
          }
          tl.field_q = tl.field_q + 1;
          if (tk.field_a) {
            if (-1 == AlphaWidgetContainer.field_J ||
              nb.field_i[AlphaWidgetContainer.field_J].c(-41)) {
              stackIn_13_0 = (11 >= q.field_c) ? 0 : 1;
              var1_int = stackIn_13_0;
              if (var1_int == 0) {
                EditableTextField.field_L = EditableTextField.field_L - 32;
              }
              if (!(-640 <= EditableTextField.field_L) ||
                var1_int != 0) {
                EditableTextField.field_L = -640;
                tk.field_a = false;
                if (el.field_c) {
                  TextHotspotBounds.field_q = false;
                  fl.field_d = true;
                  mc.field_w = -1;
                  tb.field_e = true;
                  if (null != GzipDecompressor.field_b) {
                    GzipDecompressor.field_b.field_K = false;
                    kh.a((byte) 92);
                  }
                  return;
                }
                if (q.field_c != AlphaWidgetContainer.field_J) {
                  ah.field_e = -1;
                  if (AlphaWidgetContainer.field_J == 2) {
                    sn.field_b[0] = null;
                    sn.field_b[1] = null;
                  }
                  mc.field_w = AlphaWidgetContainer.field_J;
                  AlphaWidgetContainer.field_J = q.field_c;
                  if (AlphaWidgetContainer.field_J == 5 ||
                    AlphaWidgetContainer.field_J == 2) {
                    mc.field_w = 4;
                  }
                }
              }
            }
          } else {
            EditableTextField.field_L = EditableTextField.field_L + 32;
            if (EditableTextField.field_L > 0) {
              tb.field_e = false;
              EditableTextField.field_L = 0;
            }
          }
          var1_intLifetime1 = -2;
          if (EditableTextField.field_L != 0) {
            if (AlphaWidgetContainer.field_J >= 0) {
              stackIn_40_0 = (nb.field_i[AlphaWidgetContainer.field_J].c(-39)) ? 1 : 0;
            } else {
              stackIn_40_0 = 0;
            }
          } else {
            stackIn_40_0 = 0;
          }
          var2 = stackIn_40_0;
          if (AlphaWidgetContainer.field_J != 11) {
            while (mm.b((byte) 70)) {
              if (lj.field_t == 13 &&
                AlphaWidgetContainer.field_J != 4 &&
                AlphaWidgetContainer.field_J != 6) {
                if (0 == AlphaWidgetContainer.field_J) {
                  el.field_c = true;
                  var1_intLifetime1 = -1;
                }
                if (AlphaWidgetContainer.field_J != 2) {
                  stackIn_60_0 = (AlphaWidgetContainer.field_J == 5) ? 1 : 0;
                } else {
                  stackIn_60_0 = 1;
                }
                var3 = stackIn_60_0;
                if (var3 != 0 &&
                  mc.field_w == 0) {
                  mc.field_w = 4;
                } else if (mc.field_w == 6) {
                  var1_intLifetime1 = 4;
                } else {
                  var1_intLifetime1 = mc.field_w;
                }
              } else {
                if (AlphaWidgetContainer.field_J != -1 &&
                  var2 == 0) {
                  var3 = nb.field_i[AlphaWidgetContainer.field_J].e(1);
                  if (var3 > -2) {
                    var1_intLifetime1 = var3;
                  }
                }
              }
              if (lj.field_t != 12) {
                continue;
              }
              if (AgeValidator.field_j < 2) {
                continue;
              }
              stackIn_73_0 = !(MusicPatchPcmStream.field_w);
              MusicPatchPcmStream.field_w = stackIn_73_0;
            }
            if (0 <= var1_intLifetime1 &&
              var2 == 0) {
              nb.field_i[var1_intLifetime1].c(-1, AlphaWidgetContainer.field_J);
              nb.field_i[var1_intLifetime1].b((byte) -108);
            }
          }
          if (AlphaWidgetContainer.field_J >= 0 &&
            var2 == 0) {
            var3 = nb.field_i[AlphaWidgetContainer.field_J].b(8779);
            if (-2 < var3) {
              if (var3 >= 0) {
                nb.field_i[var3].c(-1, AlphaWidgetContainer.field_J);
                nb.field_i[var3].b((byte) 55);
              }
              var1_intLifetime1 = var3;
            }
          }
          if (var1_intLifetime1 > -2 &&
            AlphaWidgetContainer.field_J != var1_intLifetime1) {
            q.field_c = var1_intLifetime1;
            tk.field_a = true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (jk.field_ab != 0) {
            if (3 != AlphaWidgetContainer.field_J &&
              8 != AlphaWidgetContainer.field_J) {
              if ((5 == AlphaWidgetContainer.field_J)) {
                ce.a(EditableTextField.field_L, false, false, true);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              ce.a(EditableTextField.field_L, false, false, false);
            }
          }
          fa.field_e = false;
          if (AlphaWidgetContainer.field_J == 4 &&
            DefaultTextWidgetRenderer.b(42)) {
            if (0 < qd.field_R) {
              qd.field_R = qd.field_R - 1;
            }
            var3 = 20 + (-ak.field_c.field_x + 640) - EditableTextField.field_L;
            var4 = 500 - ak.field_c.field_A;
            if (nk.field_w >= var3 &&
              640 > nk.field_w &&
              var4 <= NodeHashTableIterator.field_e &&
              NodeHashTableIterator.field_e < 480) {
              fa.field_e = true;
              if (jk.field_ab != 0 &&
                0 == qd.field_R) {
                try {
                  qd.field_R = 25;
                  Bzip2State.a(RichTextLayout.c(-125), "http://itunes.apple.com/us/app/miner-disturbance/id374275550?mt=8", 11050, true);
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var5 = (Exception) (Object) decompiledCaughtException;
                  var5.printStackTrace();
                }
              }
            }
          }
          if (param0 != -18627) {
            oc.e(5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var1 = (RuntimeException) (Object) decompiledCaughtException;
          throw lj.wrapClientException((Throwable) ((Object) var1), "oc.B(" + param0 + ')');
        }
    }

    final static CoverageBitmapFont a(ResourceArchive param0, byte param1, String param2, String param3, ResourceArchive param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        CoverageBitmapFont stackIn_2_0 = null;
        CoverageBitmapFont stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param4.getGroupIdByName(127, param2);
          if (param1 != 125) {
            stackIn_2_0 = (CoverageBitmapFont) null;
            return stackIn_2_0;
          }
          var6 = param4.getFileIdByName(param3, var5_int, -103);
          stackIn_4_0 = pk.a(var6, param4, (byte) 82, var5_int, param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("oc.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_i = null;
        field_j = null;
        field_l = null;
        field_e = null;
        if (param0 != -640) {
          oc.f(74);
        }
        field_h = null;
    }

    final static boolean d(int param0) {
        if (param0 <= 42) {
          ResourceArchive var2 = (ResourceArchive) null;
          oc.a((ResourceArchive) null, (byte) -68, (String) null, (String) null, (ResourceArchive) null);
        }
        return cg.field_C;
    }

    oc(String param0, String param1) {
        try {
          this.field_k = param1;
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw lj.wrapClientException((Throwable) ((Object) runtimeException), "oc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(PacketBuffer param0, byte param1) {
        if (param1 > -85) {
          return;
        }
        try {
          param0.writePrefixedString(8, this.field_g);
          param0.writeBase38String((byte) 97, this.field_k);
        } catch (RuntimeException runtimeException) {
          throw lj.wrapClientException((Throwable) ((Object) runtimeException), "oc.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_f = 256;
        field_i = new bg(9, 0, 4, 1);
        field_l = new int[8192];
        field_h = "Scannox: Detects movement through rock.";
        field_j = "Age:";
    }
}
