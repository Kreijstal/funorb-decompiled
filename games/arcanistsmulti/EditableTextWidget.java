/*
 * Decompiled by CFR-JS 0.4.0.
 */
class EditableTextWidget extends TextButton {
    private boolean field_R;
    private int field_O;
    static SceneWidget field_S;
    private long field_P;
    private int field_N;
    private long field_Q;
    private boolean field_M;
    static SceneWidget field_L;
    private int field_H;
    static String field_K;
    private int field_J;

    private final int previousWordBoundary(int param0) {
        int var2;
        int var3;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (0 == this.field_N) {
          return this.field_N;
        }
        if (param0 != 1000) {
          return 12;
        }
        for (var2 = this.field_N - 1; var2 > 0; var2--) {
          if (this.field_g.charAt(-1 + var2) != 32) {
            continue;
          }
          break;
        }
        return var2;
    }

    final static void m(int param0) {
        int var1;
        if (!ContextActionMenu.field_Jb) {
          if (ce.field_i == null) {
            ce.field_i = CachedArchiveProvider.a(4, -21402);
          }
          if (ce.field_i.field_l) {
            ad.field_f = ko.orArrays(ad.field_f, ce.field_i.field_i, true);
            ce.field_i = null;
            ContextActionMenu.field_Jb = true;
          }
        }
        if (param0 != 0) {
          return;
        }
        if (!NodeHashTableIterator.field_e) {
          if (0 == (1 & PlayerActionMenu.field_g)) {
            var1 = ResizableViewResizeListener.field_d;
            if (0 >= var1 &&
              qf.field_d >= 2) {
              System.out.println("No data to pull");
            }
          } else {
            if (2 <= qf.field_d) {
              System.out.println("Orb coins not availiable");
            }
          }
          NodeHashTableIterator.field_e = true;
        }
        if (!SectorCacheStore.field_g) {
          if (null == ci.field_d) {
            ci.field_d = AlternateUsernameCredentials.a(6, false);
          }
          if (ci.field_d.field_k) {
            ec.a(ci.field_d.field_j, (byte) -49);
            ci.field_d = null;
            SectorCacheStore.field_g = true;
          }
        }
        if (!la.field_a &&
          !ta.field_b) {
          he.field_e.writeOpcode((byte) -84, 65);
          ta.field_b = true;
        }
        if (la.field_a) {
          kg.field_a = true;
        }
        if (ContextActionMenu.field_Jb &&
          SectorCacheStore.field_g &&
          kg.field_a &&
          NodeHashTableIterator.field_e) {
          wm.g(0);
          qc.a(false);
        }
    }

    final void drawLayer(byte param0, int param1, int param2, int param3) {
        WidgetTextLayout var5 = null;
        long var6 = 0L;
        if (param0 > -52) {
          return;
        }
        if (this.field_r != null &&
          param2 == 0) {
          this.field_r.paint((UiComponent) (this), 5592405, param1, param3, this.field_B);
          if (this.field_r instanceof WidgetTextLayout) {
            var5 = (WidgetTextLayout) ((Object) this.field_r);
            if (this.field_N != this.field_J) {
              var5.drawSelection(param3, (UiComponent) (this), param1, 6600, this.field_N, this.field_J);
            }
            var6 = qj.monotonicTimeMillis(-26572);
            if ((-this.field_Q + var6) % 1000L < 500L) {
              var5.drawCaret(79, param3, param1, this.field_N, (UiComponent) (this));
            }
          }
        }
    }

    void notifyTextChanged(int param0) {
        if (this.field_o instanceof TextInputListener) {
          ((TextInputListener) (this.field_o)).onTextChanged(this, -20626);
        }
        if (param0 != -22706) {
          this.notifyTextSubmitted(false);
        }
    }

    private final void deleteSelection(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != -10292) {
          return;
        }
        if (this.field_N != this.field_J) {
          var2 = this.field_J < this.field_N ? this.field_J : this.field_N;
          var3 = this.field_N <= this.field_J ? this.field_J : this.field_N;
          this.field_J = var2;
          this.field_N = var2;
          this.field_g = this.field_g.substring(0, var2) + this.field_g.substring(var3, this.field_g.length());
          this.notifyTextChanged(-22706);
        }
    }

    void updatePointer(UiComponent param0, int param1, int param2, int param3) {
        WidgetTextLayout var5 = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.updateScrollOffset((byte) -100);
          if (this.field_t == 1) {
            if (this.field_r instanceof WidgetTextLayout) {
              var5 = (WidgetTextLayout) ((Object) this.field_r);
              var6 = var5.hitTestCharacter(param1, (UiComponent) (this), MenuButtonPanel.field_I, EmailLoginCredentials.field_g, param3, param2 ^ 2364);
              if (var6 != -1) {
                if (this.field_R &&
                  var6 < this.field_O &&
                  this.field_J < var6) {
                  var6 = this.field_O;
                }
                this.field_N = var6;
              }
            }
            this.field_Q = qj.monotonicTimeMillis(-26572);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_14_0 = var5_ref;
          stackIn_14_1 = new StringBuilder().append("rn.E(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void setCaret(int param0, int param1) {
        this.field_N = param1;
        if (!ri.field_b[param0]) {
          this.field_J = this.field_N;
        }
    }

    final void clearText(int param0) {
        int discarded$0 = 0;
        this.field_N = 0;
        if (param0 != 3545) {
          discarded$0 = this.previousWordBoundary(39);
        }
        this.field_g = "";
        this.field_J = 0;
        this.notifyTextChanged(-22706);
    }

    final static void i(byte param0) {
        int var2 = 0;
        CipherPacketBuffer var3 = null;
        SocialListEntry var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          SceneScrollPane.field_Db = false;
          om.field_x = null;
          DirectByteStorage.field_f = null;
          if (param0 >= -97) {
            var3 = (CipherPacketBuffer) null;
            EditableTextWidget.a(true, (CipherPacketBuffer) null);
          }
          if (null != LinkButtonPainter.field_j) {
            LinkButtonPainter.field_j.clear(-124);
            LinkButtonPainter.field_j = null;
          }
          bc.field_c = null;
          if (null != UiTheme.field_a) {
            UiTheme.field_a.clear(99);
            UiTheme.field_a = null;
          }
          nk.field_q = null;
          if (ph.field_a != null) {
            ph.field_a.clear(10);
            ph.field_a = null;
          }
          OptionsDialog.field_qb = null;
          if (null != bc.field_c) {
            var4 = (SocialListEntry) (bc.field_c.firstInTraversal(102));
            while (var4 != null) {
              var4.unlinkSecondary((byte) 88);
              var4 = (SocialListEntry) (bc.field_c.nextInTraversal(-1));
            }
            bc.field_c = null;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var1), "rn.L(" + param0 + ')');
        }
    }

    private final void cutSelection(byte param0) {
        this.copySelection((byte) 56);
        if (param0 < 107) {
          return;
        }
        this.deleteSelection(-10292);
    }

    private final void pasteClipboard(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            if (param0 != -9711) {
              return;
            }
            this.deleteSelection(-10292);
            this.insertText(var2, (byte) -34);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    EditableTextWidget(String param0, UiListener param1, int param2) {
        super(param0, param1);
        this.field_R = false;
        this.field_O = -1;
        this.field_P = 0L;
        try {
          this.field_r = MusicCrossfadeStream.field_n.field_l;
          this.field_H = param2;
          this.setText(true, param0, false);
          this.field_M = true;
          this.field_Q = qj.monotonicTimeMillis(-26572);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "rn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 1) {
          EditableTextWidget.m(-26);
        }
        field_L = null;
        field_K = null;
        field_S = null;
    }

    final boolean handleKeyInput(UiComponent param0, byte param1, char param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_73_1 = 0;
        int stackIn_74_2 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_Q = qj.monotonicTimeMillis(-26572);
          if (param2 != 60 &&
            param2 != 62) {
            if (param1 >= -120) {
              return false;
            }
            if (param2 >= 32 &&
              param2 <= 126) {
              if (this.field_N != this.field_J) {
                this.deleteSelection(-10292);
              }
              if (-1 == this.field_H ||
                !(this.field_g.length() >= this.field_H)) {
                if (this.field_N >= this.field_g.length()) {
                  this.field_g = this.field_g + param2;
                  dupTemp$0 = this.field_g.length();
                  this.field_N = dupTemp$0;
                  this.field_J = dupTemp$0;
                } else {
                  this.field_g = this.field_g.substring(0, this.field_N) + param2 + this.field_g.substring(this.field_N, this.field_g.length());
                  this.field_N = this.field_N + 1;
                  this.field_J = this.field_N;
                }
                this.notifyTextChanged(-22706);
              }
              return true;
            }
            if (param3 == 85) {
              if (this.field_N != this.field_J) {
                this.deleteSelection(-10292);
                return true;
              }
              if (this.field_N <= 0) {
                return false;
              }
              this.field_J = -1 + this.field_N;
              this.deleteSelection(-10292);
              return true;
            }
            if (param3 != 101) {
              if (param3 == 13) {
                this.clearText(3545);
                return true;
              }
              if (param3 != 96) {
                if (param3 == 97) {
                  if (this.field_N < this.field_g.length()) {
                    stackIn_73_1 = 81;
                    if (!ri.field_b[82]) {
                      stackIn_74_2 = 1 + this.field_N;
                    } else {
                      stackIn_74_2 = this.nextWordBoundary(-9125);
                    }
                    this.setCaret(stackIn_73_1, stackIn_74_2);
                    return true;
                  }
                } else {
                  if (param3 == 102) {
                    this.setCaret(81, 0);
                    return true;
                  }
                  if (param3 == 103) {
                    this.setCaret(81, this.field_g.length());
                    return true;
                  }
                  if (param3 == 84) {
                    this.notifyTextSubmitted(false);
                    return true;
                  }
                  if (ri.field_b[82] &&
                    param3 == 65) {
                    this.cutSelection((byte) 122);
                    return true;
                  }
                  if (ri.field_b[82] &&
                    66 == param3) {
                    this.copySelection((byte) 56);
                    return true;
                  }
                  if (ri.field_b[82] &&
                    67 == param3) {
                    this.pasteClipboard(-9711);
                    return true;
                  }
                }
              } else {
                if (this.field_N > 0) {
                  stackIn_45_1 = 81;
                  if (ri.field_b[82]) {
                    stackIn_46_2 = this.previousWordBoundary(1000);
                  } else {
                    stackIn_46_2 = this.field_N - 1;
                  }
                  this.setCaret(stackIn_45_1, stackIn_46_2);
                  return true;
                }
              }
            } else {
              if (this.field_J != this.field_N) {
                this.deleteSelection(-10292);
                return true;
              }
              if (this.field_N < this.field_g.length()) {
                this.field_J = 1 + this.field_N;
                this.deleteSelection(-10292);
                return true;
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_80_0 = var5;
          stackIn_80_1 = new StringBuilder().append("rn.N(");
          if (param0 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void updateScrollOffset(byte param0) {
        TextLayout var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        WidgetTextLayout var9;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        if (!this.field_M) {
          this.field_i = 0;
          this.field_h = 0;
          return;
        }
        if (!(this.field_r instanceof WidgetTextLayout)) {
          return;
        }
        var9 = (WidgetTextLayout) ((Object) this.field_r);
        var3 = var9.getTextLayout((UiComponent) (this), -46);
        var4 = var3.maxLineWidth((byte) 121);
        var5 = var9.getAvailableWidth((UiComponent) (this), (byte) 101);
        if (param0 > -38) {
          return;
        }
        var6 = var9.lineHeight(27184) >> 1;
        if (-var6 + var5 > var4) {
          this.field_i = 0;
          this.field_h = 0;
        } else {
          var7 = this.field_h + var3.characterOffset(this.field_N, 0);
          if (-var6 + var5 >= var7) {
            if (var7 < var6) {
              this.field_h = this.field_h + (-var7 + var6);
            }
          } else {
            this.field_h = this.field_h - (var7 + var6 - var5);
          }
          if (0 < this.field_h) {
            this.field_h = 0;
          } else {
            if (this.field_h < -var5 + var6) {
              this.field_h = var6 - var5;
            }
          }
        }
    }

    private final int nextWordBoundary(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != -9125) {
          this.pasteClipboard(99);
        }
        var2 = this.field_g.length();
        if (var2 == this.field_N) {
          return this.field_N;
        }
        for (var3 = 1 + this.field_N; var3 < var2; var3++) {
          if (32 != this.field_g.charAt(var3 - 1)) {
            continue;
          }
          break;
        }
        return var3;
    }

    private final void notifyTextSubmitted(boolean param0) {
        if (this.field_o instanceof TextInputListener) {
          ((TextInputListener) (this.field_o)).onTextSubmitted(this, 117);
        }
        if (param0) {
          this.drawLayer((byte) -7, 102, 2, -128);
        }
    }

    final void setText(boolean param0, String param1, boolean param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 == null) {
            param1 = "";
          }
          this.field_g = param1;
          var4_int = param1.length();
          if (-1 != this.field_H &&
            var4_int > this.field_H) {
            this.field_g = this.field_g.substring(0, this.field_H);
          }
          dupTemp$1 = this.field_g.length();
          this.field_J = dupTemp$1;
          this.field_N = dupTemp$1;
          if (!param0) {
            this.notifyTextChanged(-22706);
          }
          if (param2) {
            this.setCaret(-16, 109);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("rn.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void insertText(String param0, byte param1) {
        int var3_int = 0;
        if (this.field_H != -1) {
          var3_int = this.field_H - this.field_g.length();
          if (var3_int >= 0) {
            return;
          }
          param0 = param0.substring(0, var3_int);
        }
        if (this.field_N != this.field_g.length()) {
          this.field_g = this.field_g.substring(0, this.field_N) + param0 + this.field_g.substring(this.field_N, this.field_g.length());
        } else {
          this.field_g = this.field_g + param0;
        }
        this.field_N = this.field_N + param0.length();
        this.field_J = this.field_N;
        if (param1 >= -27) {
          return;
        }
        try {
          this.notifyTextChanged(-22706);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "rn.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static MeshModel a(boolean param0, CipherPacketBuffer param1) {
        int var7 = 0;
        MeshModel stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        MeshModel var5 = null;
        int var6 = 0;
        int var8 = 0;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2_int = param1.readBits(28089, 8);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = hd.readBitFlag(param1, (byte) 118) ? 1 : 0;
          var4 = hd.readBitFlag(param1, (byte) 126) ? 1 : 0;
          if (!param0) {
            field_K = (String) null;
          }
          var5 = new MeshModel();
          var5.field_f = (short)param1.readBits(28089, 16);
          var5.field_b = eo.readPackedShorts(param1, var5.field_b, 16, 16);
          var5.field_B = eo.readPackedShorts(param1, var5.field_B, 16, 16);
          var5.field_L = eo.readPackedShorts(param1, var5.field_L, 16, 16);
          var5.field_G = (short)param1.readBits(28089, 16);
          var5.field_U = eo.readPackedShorts(param1, var5.field_U, 16, 16);
          var5.field_T = eo.readPackedShorts(param1, var5.field_T, 16, 16);
          var5.field_O = eo.readPackedShorts(param1, var5.field_O, 16, 16);
          if (var3 != 0) {
            var5.field_A = (short)param1.readBits(28089, 16);
            var5.field_r = eo.readPackedShorts(param1, var5.field_r, 16, 16);
            var5.field_e = eo.readPackedShorts(param1, var5.field_e, 16, 16);
            var5.field_S = eo.readPackedShorts(param1, var5.field_S, 16, 16);
            var5.field_w = eo.readPackedShorts(param1, var5.field_w, 16, 16);
            var5.field_q = eo.readPackedShorts(param1, var5.field_q, 16, 16);
            var5.field_u = eo.readPackedShorts(param1, var5.field_u, 16, 16);
          }
          if (var4 != 0) {
            param1.readBits(28089, 16);
            var5.field_Q = eo.readPackedShorts(param1, var5.field_Q, 16, 16);
            var5.field_d = eo.readPackedShorts(param1, var5.field_d, 16, 16);
            var5.field_D = eo.readPackedShorts(param1, var5.field_D, 16, 16);
            var5.field_s = eo.readPackedShorts(param1, var5.field_s, 16, 16);
            var5.field_h = eo.readPackedShorts(param1, var5.field_h, 16, 16);
          }
          if (hd.readBitFlag(param1, (byte) 126)) {
            var5.field_z = eo.readPackedShorts(param1, var5.field_z, 16, 16);
          }
          if (hd.readBitFlag(param1, (byte) 120)) {
            var5.field_H = ub.readPackedBytes(3, param1, 16, var5.field_H);
            var6 = 0;
            for (var7 = 0; var7 < var5.field_H.length; var7++) {
              if ((var5.field_H[var7] & 255) > var6) {
                var6 = var5.field_H[var7] & 255;
              }
            }
            if (var6 != 0) {
              var5.field_F = (byte)(1 + var6);
            } else {
              var5.field_H = null;
            }
          }
          stackIn_25_0 = var5;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("rn.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    private final void copySelection(byte param0) {
        if (param0 != 56) {
          UiComponent var3 = (UiComponent) null;
          this.handlePointerPress(84, 58, (UiComponent) null, 100, 126, 7, -93);
        }
        String var2 = this.getSelectedText(param0 - 23972);
        if (var2.length() > 0) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.getSelectedText(-23916))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final String getSelectedText(int param0) {
        int var2 = this.field_J >= this.field_N ? this.field_N : this.field_J;
        if (param0 != -23916) {
          return (String) null;
        }
        int var3 = this.field_N <= this.field_J ? this.field_J : this.field_N;
        return this.field_g.substring(var2, var3);
    }

    final boolean handlePointerPress(int param0, int param1, UiComponent param2, int param3, int param4, int param5, int param6) {
        int stackIn_5_1 = 0;
        int stackIn_6_2 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9_int = 0;
        long var9 = 0L;
        try {
          var8_int = 49 % ((param4 + 42) / 35);
          if (!super.handlePointerPress(param0, param1, param2, param3, -78, param5, param6)) {
            return false;
          }
          if (!(this.field_r instanceof WidgetTextLayout)) {
            return false;
          }
          var9_int = ((WidgetTextLayout) ((Object) this.field_r)).hitTestCharacter(param6, (UiComponent) (this), MenuButtonPanel.field_I, EmailLoginCredentials.field_g, param3, 2454);
          stackIn_5_1 = 81;
          if (var9_int != -1) {
            stackIn_6_2 = var9_int;
          } else {
            stackIn_6_2 = 0;
          }
          this.setCaret(stackIn_5_1, stackIn_6_2);
          var9 = qj.monotonicTimeMillis(-26572);
          stackIn_9_1 = !(-this.field_P + var9 >= 250L);
          this.field_R = stackIn_9_1;
          if (this.field_R) {
            this.field_J = this.previousWordBoundary(1000);
            this.field_N = this.nextWordBoundary(-9125);
            if (this.field_N > 0 &&
              32 == this.field_g.charAt(-1 + this.field_N)) {
              this.field_N = this.field_N - 1;
            }
            this.field_O = this.field_N;
          }
          this.field_P = var9;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("rn.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_K = "WINNER - ";
    }
}
