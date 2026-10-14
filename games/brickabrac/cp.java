/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp extends SingleChildWidget {
    private NodeDeque field_J;
    static UiComponent field_K;
    static String field_G;
    static RgbSprite volcanicMidSprite;
    static String field_H;

    final static void a(boolean param0, int param1) {
        int var2;
        int var3;
        PlayerBoard var4;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (param1 != 21543) {
          var4 = (PlayerBoard) null;
          cp.a(103, 104, 91, (byte) -14, (PlayerBoard) null, 105, 90);
        }
        if (0 >= go.field_c) {
          var2 = (QuickChatMenu.h(-26090)) ? 0 : 1;
        } else {
          if (null == jj.field_a) {
            ua.field_d = ff.a(0, 0, 640, 480, true, lp.field_ub);
          } else {
            ua.field_d = jj.field_a.a(true);
            qm.a(97, 2);
          }
          if (ua.field_d == null) {
            var2 = 3;
          } else {
            var2 = 2;
            ap.a((byte) 117, ua.field_d);
          }
        }
        if (null == jj.field_a &&
          gh.field_c) {
          bq.a(param0, var2, (byte) 104);
        }
    }

    final void drawLayer(int parentY, int parentX, int layer, byte obfuscationGuard) {
        int var7 = BrickABrac.field_J ? 1 : 0;
        if (this.renderer != null) {
          this.renderer.paintWidget(true, obfuscationGuard - 20607, parentX, (Widget) (this), parentY);
        }
        NodeDequeCursor var5 = new NodeDequeCursor(this.field_J);
        Widget var6 = (Widget) (var5.last(true));
        while (var6 != null) {
          var6.drawLayer(parentY + this.y, parentX + this.x, layer, (byte) -11);
          var6 = (Widget) (var5.previous(-24706));
        }
        if (obfuscationGuard != -11) {
          field_G = (String) null;
        }
    }

    public static void j(byte param0) {
        volcanicMidSprite = null;
        field_G = null;
        if (param0 > -91) {
          ta var2 = (ta) null;
          cp.a(-80, 69, (ta) null, 50, (ta) null, -32);
        }
        field_H = null;
        field_K = null;
    }

    final void a(int param0) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (param0 > -119) {
          return;
        }
        NodeDequeCursor var2 = new NodeDequeCursor(this.field_J);
        jc var3 = (jc) (var2.first(240));
        while (var3 != null) {
          var3.field_N = false;
          var3 = (jc) (var2.next(7));
        }
        this.child = null;
    }

    final void a(int param0, Widget param1) {
        jc var3 = null;
        try {
          if (!(param1 instanceof jc)) {
            throw new IllegalArgumentException();
          }
          var3 = (jc) (param1);
          if (param0 > -63) {
            cp.j((byte) -73);
          }
          this.field_J.addFirst(true, var3);
          var3.field_N = true;
          var3.tryFocus(true, (Widget) (this));
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "cp.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void i(byte param0) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        NodeDequeCursor var2 = new NodeDequeCursor(this.field_J);
        jc var3 = (jc) (var2.first(240));
        if (param0 != -36) {
          return;
        }
        while (var3 != null) {
          if (var3.a(-94)) {
            var3.unlink((byte) 111);
          }
          var3 = (jc) (var2.next(param0 ^ -37));
        }
    }

    public cp() {
        super(0, 0, SpriteGeometry.field_y, r.field_w, (WidgetRenderer) null, (WidgetListener) null);
        this.field_J = new NodeDeque();
    }

    final static lo a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        lo var5 = null;
        lo stackIn_4_0 = null;
        lo stackIn_7_0 = null;
        lo stackIn_10_0 = null;
        lo stackIn_13_0 = null;
        lo stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            param0.length() != 0) {
            var2_int = param0.indexOf('@');
            if (-1 == var2_int) {
              stackIn_7_0 = la.field_a;
              return stackIn_7_0;
            }
            var3 = param0.substring(0, var2_int);
            var4 = param0.substring(var2_int + 1);
            if (param1 >= -16) {
              stackIn_10_0 = (lo) null;
              return stackIn_10_0;
            }
            var5 = SingleChildWidget.a(var3, false);
            if (var5 == null) {
              stackIn_15_0 = ji.a(var4, 0);
              return stackIn_15_0;
            }
            stackIn_13_0 = var5;
            return stackIn_13_0;
          }
          stackIn_4_0 = ByteStorage.field_b;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("cp.L(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, ta param2, int param3, ta param4, int param5) {
        try {
          kn.field_y = param1;
          cn.field_c = param5;
          if (param3 <= 25) {
            cp.h(24);
          }
          cd.field_c = param4;
          jb.field_H = param0;
          c.field_l = param2;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "cp.Q(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final void i(int param0) {
        int var5 = BrickABrac.field_J ? 1 : 0;
        int var3 = 18 / ((36 - param0) / 43);
        NodeDequeCursor var2 = new NodeDequeCursor(this.field_J);
        jc var4 = (jc) (var2.first(240));
        while (var4 != null) {
          if (var4.h(0)) {
            var4.unlink((byte) 111);
          }
          var4 = (jc) (var2.next(7));
        }
        this.child = (Widget) ((Object) this.g(-126));
    }

    final static void h(int param0) {
        int var3 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_33_0 = null;
        ta stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        ta var9 = null;
        int var10 = 0;
        PlayerBoard var11 = null;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          var1_int = CachedArchiveSource.field_r;
          var2 = 0;
          if (param0 != -16546) {
            var11 = (PlayerBoard) null;
            cp.a(-114, -15, 90, (byte) -109, (PlayerBoard) null, -85, -67);
          }
          if (ArchiveFetchClient.field_p == 2) {
            var3_long = -un.field_g + MonotonicTime.nowMillis(false);
            var2 = (int)((-var3_long + 10999L) / 1000L);
            if (0 > var2) {
              var2 = 0;
            }
          }
          for (var3 = 0; qh.field_i.length > var3; var3++) {
            var4 = BrickABrac.field_K[var3];
            if (var4 < 0) {
              var5 = NewAchievementsScreen.field_H;
            } else {
              if (UiComponent.field_H.selectedIndex != var4) {
                var5 = eb.field_n;
              } else {
                var5 = LevelCompleteScreen.field_A;
              }
            }
            var6 = qh.field_i[var3];
            if (2 == ArchiveFetchClient.field_p &&
              1 == var2) {
              if (QuickChatPhraseRegistry.field_k.length >= ik.field_b.length) {
                stackIn_19_0 = QuickChatPhraseRegistry.field_k.length;
              } else {
                stackIn_19_0 = ik.field_b.length;
              }
              var7 = stackIn_19_0;
              if (HuffmanCodec.field_h.length <= SingleChildWidget.field_F.length) {
                stackIn_22_0 = SingleChildWidget.field_F.length;
              } else {
                stackIn_22_0 = HuffmanCodec.field_h.length;
              }
              var8 = stackIn_22_0;
              if (var3 >= 6 &&
                6 + var7 > var3) {
                if (-var7 - 6 + var3 + QuickChatPhraseRegistry.field_k.length < 0) {
                  stackIn_27_0 = "";
                } else {
                  stackIn_27_0 = QuickChatPhraseRegistry.field_k[-var7 + var3 + (-6 + QuickChatPhraseRegistry.field_k.length)];
                }
                var6 = stackIn_27_0;
              }
              if (7 + var7 <= var3 &&
                7 - (-var7 - var8) > var3) {
                if (-var7 + (var3 - 7) < SingleChildWidget.field_F.length) {
                  stackIn_33_0 = SingleChildWidget.field_F[var3 + (-7 - var7)];
                } else {
                  stackIn_33_0 = "";
                }
                var6 = stackIn_33_0;
              }
            }
            if (-2 == var4) {
              var6 = Integer.toString(var2);
            }
            var7Lifetime1 = hm.a(!(0 > var4), var6, 0);
            var8Lifetime1 = wi.field_k - (var7Lifetime1 >> 1);
            if (var4 >= 0) {
              var1_int = var1_int + kn.field_y;
              if (UiComponent.field_H.selectedIndex != var4) {
                stackIn_44_0 = cd.field_c;
              } else {
                stackIn_44_0 = c.field_l;
              }
              var9 = stackIn_44_0;
              if (var9 != null) {
                var9.a((cn.field_c << 1) + var7Lifetime1, b.field_c + (jb.field_H << 1), -cn.field_c + var8Lifetime1, false, var1_int);
              }
              var1_int = var1_int + jb.field_H;
            }
            if (var4 >= 0) {
              kp.field_b.drawLeft(var6, var8Lifetime1, var1_int + so.field_b, var5, -1);
              var1_int = var1_int + (jb.field_H + (kn.field_y + b.field_c));
            } else {
              StateIconLabel.field_Wb.drawLeft(var6, var8Lifetime1, var1_int + DualLinkIterator.field_f, var5, -1);
              var1_int = var1_int + IntArrayRequest.field_s;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "cp.F(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, PlayerBoard param4, int param5, int param6) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_8_3 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        RgbSprite var9 = null;
        int var8Lifetime1;
        try {
          if (param4.maskedTicks < 50) {
            return;
          }
          var7_int = param4.maskedTicks - 50;
          var8 = var7_int * 96 / 100;
          if (var8 > 96) {
            var8 = 96;
          }
          stackIn_7_0 = param0;
          stackIn_7_1 = param5;
          stackIn_7_2 = param1 / param6;
          if (param6 != 1) {
            stackIn_8_3 = 0;
          } else {
            stackIn_8_3 = 35;
          }
          Rasterizer2D.fillRectangleAlpha(stackIn_7_0, stackIn_7_1, stackIn_7_2, -stackIn_8_3 + param2 / param6, 0, var8);
          if (150 < var7_int * 2 &&
            param4.resultCode > 0 &&
            param4.resultCode - 1 < ArchiveNetworkClient.field_s.length) {
            var8Lifetime1 = -75 + var7_int;
            if (50 < var8Lifetime1) {
              var8Lifetime1 = 50;
            }
            var8Lifetime1 = 256 * var8Lifetime1 / 50;
            var9 = ArchiveNetworkClient.field_s[param4.resultCode - 1];
            var9.b(param0 + (param1 - param6 * var9.canvasWidth) / (param6 * 2), param5 + (param2 - var9.canvasHeight * param6) / (param6 * 2), var8Lifetime1);
            lo.a(param1, var8Lifetime1, 60, param0, param6, param5, param2, param4);
          }
          if (param3 < 118) {
            cp.a(true, 86);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_21_0 = var7;
          stackIn_21_1 = new StringBuilder().append("cp.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static TableDataRequest requestTableData(int obfuscationGuard, int tableId, int columnCount, int rowLimit, int opcode) {
        int clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        TableDataRequest request = (TableDataRequest) (GameplayAudioEvent.pendingTableRequests.first(-91));
        while (request != null) {
          if (~request.tableId == ~tableId) {
            return request;
          }
          request = (TableDataRequest) (GameplayAudioEvent.pendingTableRequests.next((byte) 116));
        }
        TableDataRequest created = new TableDataRequest();
        request = created;
        created.rowLimit = rowLimit;
        created.columnCount = columnCount;
        if (obfuscationGuard != -2) {
          return (TableDataRequest) null;
        }
        request.tableId = tableId;
        GameplayAudioEvent.pendingTableRequests.addLast(request, (byte) 3);
        uo.sendTableRequest(request, opcode, (byte) 68);
        return request;
    }

    final Widget h(byte param0) {
        NodeDequeCursor var2;
        jc var3;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        var2 = new NodeDequeCursor(this.field_J);
        if (param0 != 25) {
          cp.j((byte) -34);
        }
        var3 = (jc) (var2.first(param0 + 215));
        while (var3 != null) {
          if (var3.field_N) {
            return var3.g((byte) -3);
          }
          var3 = (jc) (var2.next(7));
        }
        return null;
    }

    final jc g(int param0) {
        NodeDequeCursor var2;
        jc var3;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (param0 >= -96) {
          field_G = (String) null;
        }
        var2 = new NodeDequeCursor(this.field_J);
        var3 = (jc) (var2.first(240));
        while (var3 != null) {
          if (var3.field_N) {
            return var3;
          }
          var3 = (jc) (var2.next(7));
        }
        return null;
    }

    static {
        field_H = "<%0> would need a rating of <%1> to play with the current options.";
        field_G = "Confirm Password: ";
    }
}
