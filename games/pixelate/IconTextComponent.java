/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IconTextComponent extends SceneWidget {
    static int field_Mb;
    static String field_Kb;
    static int[] field_Ib;
    static int field_Jb;
    SceneWidget field_Eb;
    private SceneWidget field_Fb;
    static String field_Gb;
    static int field_Hb;
    static boolean field_Nb;
    static String field_Lb;

    final void setBoundsAndLayout(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.setBounds(param3, param0, param4, 256, param5);
        if (param6 == -2147483648) {
          this.layoutIconLabel(param6 ^ 0, param2, param1);
          return;
        }
        field_Ib = (int[]) null;
        this.layoutIconLabel(param6 ^ 0, param2, param1);
    }

    IconTextComponent(long param0, SceneWidget param1, SceneWidget param2, SceneWidget param3, Sprite param4, String param5) {
        super(param0, param1);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (param4 != null) {
            this.field_Fb = new SceneWidget(0L, param2);
            this.field_Fb.field_H = param4;
            this.addChild(this.field_Fb, (byte) 26);
          }
          if (param5 != null) {
            this.field_Eb = new SceneWidget(0L, param3, param5);
            this.addChild(this.field_Eb, (byte) 26);
            this.markTreeDirty(-257);
          } else {
            this.markTreeDirty(-257);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("lo.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final int getPreferredWidth(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        if (param0 == -25469) {
          var4 = -param1;
          var5 = -param1;
          if (this.field_Fb != null) {
            var4 = this.field_Fb.getContentWidth(0);
          }
          if (null != this.field_Eb) {
            var5 = this.field_Eb.getContentWidth(param0 + 25469);
          }
          return param2 + var4 + (param2 + param1) + var5;
        }
        IconTextComponent.releaseStatics(1);
        var4Lifetime1 = -param1;
        var5Lifetime1 = -param1;
        if (this.field_Fb != null) {
          var4Lifetime1 = this.field_Fb.getContentWidth(0);
        }
        if (null != this.field_Eb) {
          var5Lifetime1 = this.field_Eb.getContentWidth(param0 + 25469);
        }
        return param2 + var4Lifetime1 + (param2 + param1) + var5Lifetime1;
    }

    private final void layoutIconLabel(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        if (param0 != -2147483648) {
          return;
        }
        var4 = -param1;
        if (this.field_Fb != null) {
          var4 = this.field_Fb.getContentWidth(0);
        }
        var5 = -param1;
        if (null != this.field_Eb) {
          var5 = this.field_Eb.measureContentWidth((byte) 95, -param2 - var4 - param2 + (this.field_K - param1));
        }
        var6 = var5 + param1 + (param2 + (var4 + param2));
        if (var6 > this.field_K) {
          var5 = var5 + (-var6 + this.field_K);
          var6 = this.field_K;
        }
        if (this.horizontalAlignment == 1) {
          param2 = param2 + (this.field_K - var6) / 2;
        }
        if (this.horizontalAlignment == 2) {
          param2 = param2 + (this.field_K - var6);
        }
        if (null != this.field_Fb) {
          this.field_Fb.setBounds(0, this.height, param2, param0 - 2147483392, var4);
          this.field_Fb.verticalAlignment = this.verticalAlignment;
        }
        if (this.field_Eb == null) {
          return;
        }
        this.field_Eb.setBounds(0, this.height, param2 + var4 + param1, 256, var5);
        if (this.field_Fb == null) {
          this.field_Eb.horizontalAlignment = this.horizontalAlignment;
        } else {
          this.field_Eb.horizontalAlignment = 0;
        }
        this.field_Eb.verticalAlignment = this.verticalAlignment;
        return;
    }

    public static void releaseStatics(int param0) {
        field_Ib = null;
        field_Lb = null;
        if (param0 >= 34) {
          field_Kb = null;
          field_Gb = null;
          return;
        }
        field_Lb = (String) null;
        field_Kb = null;
        field_Gb = null;
    }

    final static void decodeRankingRows(int param0, int param1, int param2) {
        if (WhirlpoolHasher.field_a == null) {
          WhirlpoolHasher.field_a = new int[2 * param2];
          if (PolygonClipHelpers.field_c == null ||
            !(PolygonClipHelpers.field_c.length >= param2)) {
            PolygonClipHelpers.field_c = new int[2 * param2];
          }
          if (null == TextWidgetPainter.field_b ||
            !(param2 <= TextWidgetPainter.field_b.length)) {
            TextWidgetPainter.field_b = new int[param2 * 2];
          }
          if (VerticalScrollbar.field_Fb == null ||
            !(param2 <= VerticalScrollbar.field_Fb.length)) {
            VerticalScrollbar.field_Fb = new int[2 * param2];
          }
          if (GradientOutlineTextPainter.field_q == null ||
            !(GradientOutlineTextPainter.field_q.length >= param2)) {
            GradientOutlineTextPainter.field_q = new int[2 * param2];
          }
          if (SecondaryNodeDequeIterator.field_c == null) {
            SecondaryNodeDequeIterator.field_c = new int[2 * param2];
            if (null == ArchiveRequest.field_A ||
              !(param1 + param2 <= ArchiveRequest.field_A.length)) {
              ArchiveRequest.field_A = new int[2 * (param1 + param2)];
            }
            if (GameplayScreen.field_o == null ||
              !(param2 <= GameplayScreen.field_o.length)) {
              GameplayScreen.field_o = new boolean[2 * param2];
            }
          } else {
            if (param2 <= SecondaryNodeDequeIterator.field_c.length) {
              if (null == ArchiveRequest.field_A ||
                !(param1 + param2 <= ArchiveRequest.field_A.length)) {
                ArchiveRequest.field_A = new int[2 * (param1 + param2)];
              }
              if (GameplayScreen.field_o == null ||
                !(param2 <= GameplayScreen.field_o.length)) {
                GameplayScreen.field_o = new boolean[2 * param2];
              }
            } else {
              SecondaryNodeDequeIterator.field_c = new int[2 * param2];
              if (null == ArchiveRequest.field_A ||
                !(param1 + param2 <= ArchiveRequest.field_A.length)) {
                ArchiveRequest.field_A = new int[2 * (param1 + param2)];
              }
              if (GameplayScreen.field_o == null ||
                !(param2 <= GameplayScreen.field_o.length)) {
                GameplayScreen.field_o = new boolean[2 * param2];
              }
            }
          }
        } else {
          if (WhirlpoolHasher.field_a.length < param2) {
            WhirlpoolHasher.field_a = new int[2 * param2];
            if (PolygonClipHelpers.field_c == null ||
              !(PolygonClipHelpers.field_c.length >= param2)) {
              PolygonClipHelpers.field_c = new int[2 * param2];
            }
            if (null == TextWidgetPainter.field_b ||
              !(param2 <= TextWidgetPainter.field_b.length)) {
              TextWidgetPainter.field_b = new int[param2 * 2];
            }
            if (VerticalScrollbar.field_Fb == null ||
              !(param2 <= VerticalScrollbar.field_Fb.length)) {
              VerticalScrollbar.field_Fb = new int[2 * param2];
            }
            if (GradientOutlineTextPainter.field_q == null ||
              !(GradientOutlineTextPainter.field_q.length >= param2)) {
              GradientOutlineTextPainter.field_q = new int[2 * param2];
            }
            if (SecondaryNodeDequeIterator.field_c == null ||
              !(param2 <= SecondaryNodeDequeIterator.field_c.length)) {
              SecondaryNodeDequeIterator.field_c = new int[2 * param2];
            }
            if (null == ArchiveRequest.field_A) {
              ArchiveRequest.field_A = new int[2 * (param1 + param2)];
              if (GameplayScreen.field_o == null ||
                !(param2 <= GameplayScreen.field_o.length)) {
                GameplayScreen.field_o = new boolean[2 * param2];
              }
            } else {
              if (param1 + param2 <= ArchiveRequest.field_A.length) {
                if (GameplayScreen.field_o == null ||
                  !(param2 <= GameplayScreen.field_o.length)) {
                  GameplayScreen.field_o = new boolean[2 * param2];
                }
              } else {
                ArchiveRequest.field_A = new int[2 * (param1 + param2)];
                if (GameplayScreen.field_o == null ||
                  !(param2 <= GameplayScreen.field_o.length)) {
                  GameplayScreen.field_o = new boolean[2 * param2];
                }
              }
            }
          } else {
            if (PolygonClipHelpers.field_c == null ||
              !(PolygonClipHelpers.field_c.length >= param2)) {
              PolygonClipHelpers.field_c = new int[2 * param2];
            }
            if (null == TextWidgetPainter.field_b ||
              !(param2 <= TextWidgetPainter.field_b.length)) {
              TextWidgetPainter.field_b = new int[param2 * 2];
            }
            if (VerticalScrollbar.field_Fb == null ||
              !(param2 <= VerticalScrollbar.field_Fb.length)) {
              VerticalScrollbar.field_Fb = new int[2 * param2];
            }
            if (GradientOutlineTextPainter.field_q == null) {
              GradientOutlineTextPainter.field_q = new int[2 * param2];
              if (SecondaryNodeDequeIterator.field_c == null ||
                !(param2 <= SecondaryNodeDequeIterator.field_c.length)) {
                SecondaryNodeDequeIterator.field_c = new int[2 * param2];
              }
              if (null == ArchiveRequest.field_A) {
                ArchiveRequest.field_A = new int[2 * (param1 + param2)];
                if (GameplayScreen.field_o == null ||
                  !(param2 <= GameplayScreen.field_o.length)) {
                  GameplayScreen.field_o = new boolean[2 * param2];
                }
              } else {
                if (param1 + param2 <= ArchiveRequest.field_A.length) {
                  if (GameplayScreen.field_o == null ||
                    !(param2 <= GameplayScreen.field_o.length)) {
                    GameplayScreen.field_o = new boolean[2 * param2];
                  }
                } else {
                  ArchiveRequest.field_A = new int[2 * (param1 + param2)];
                  if (GameplayScreen.field_o == null ||
                    !(param2 <= GameplayScreen.field_o.length)) {
                    GameplayScreen.field_o = new boolean[2 * param2];
                  }
                }
              }
            } else {
              if (GradientOutlineTextPainter.field_q.length >= param2) {
                if (SecondaryNodeDequeIterator.field_c == null ||
                  !(param2 <= SecondaryNodeDequeIterator.field_c.length)) {
                  SecondaryNodeDequeIterator.field_c = new int[2 * param2];
                }
                if (null == ArchiveRequest.field_A) {
                  ArchiveRequest.field_A = new int[2 * (param1 + param2)];
                  if (GameplayScreen.field_o == null ||
                    !(param2 <= GameplayScreen.field_o.length)) {
                    GameplayScreen.field_o = new boolean[2 * param2];
                  }
                } else {
                  if (param1 + param2 <= ArchiveRequest.field_A.length) {
                    if (GameplayScreen.field_o == null ||
                      !(param2 <= GameplayScreen.field_o.length)) {
                      GameplayScreen.field_o = new boolean[2 * param2];
                    }
                  } else {
                    ArchiveRequest.field_A = new int[2 * (param1 + param2)];
                    if (GameplayScreen.field_o == null ||
                      !(param2 <= GameplayScreen.field_o.length)) {
                      GameplayScreen.field_o = new boolean[2 * param2];
                    }
                  }
                }
              } else {
                GradientOutlineTextPainter.field_q = new int[2 * param2];
                if (SecondaryNodeDequeIterator.field_c == null ||
                  !(param2 <= SecondaryNodeDequeIterator.field_c.length)) {
                  SecondaryNodeDequeIterator.field_c = new int[2 * param2];
                }
                if (null == ArchiveRequest.field_A) {
                  ArchiveRequest.field_A = new int[2 * (param1 + param2)];
                  if (GameplayScreen.field_o == null ||
                    !(param2 <= GameplayScreen.field_o.length)) {
                    GameplayScreen.field_o = new boolean[2 * param2];
                  }
                } else {
                  if (param1 + param2 <= ArchiveRequest.field_A.length) {
                    if (GameplayScreen.field_o == null ||
                      !(param2 <= GameplayScreen.field_o.length)) {
                      GameplayScreen.field_o = new boolean[2 * param2];
                    }
                  } else {
                    ArchiveRequest.field_A = new int[2 * (param1 + param2)];
                    if (GameplayScreen.field_o == null ||
                      !(param2 <= GameplayScreen.field_o.length)) {
                      GameplayScreen.field_o = new boolean[2 * param2];
                    }
                  }
                }
              }
            }
          }
        }
        ChatMessage.field_o = -2147483648;
        StatefulTextPainter.field_s = param0;
        PatchNoteUsage.field_k = -2147483648;
        SecondaryNodeDeque.field_e = 0;
        NameSuggestionHelpers.field_a = 2147483647;
    }

    static {
        field_Ib = new int[8192];
        field_Kb = "Score";
        field_Gb = "There are no valid types of game that match your preferences.";
        field_Nb = true;
        field_Lb = "Total Pictures: ";
    }
}
