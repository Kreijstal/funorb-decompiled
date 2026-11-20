/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiScrollPane extends UiArrayContainer {
    private UiScrollBar horizontalScrollbar;
    private boolean verticalScrollbarOnRight;
    static String field_x;
    private boolean horizontalScrollbarOnBottom;
    UiScrollBar verticalScrollbar;
    UiViewport viewport;
    static int field_w;

    final void setVerticalScrollbar(boolean param0, UiScrollBar param1, byte param2) {
        try {
          this.verticalScrollbar = param1;
          this.children[1] = (UiComponent) ((Object) param1);
          if (param2 > -91) {
            this.applyScrollOffsets(17);
          }
          this.verticalScrollbarOnRight = param0 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "sha.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        field_x = null;
        if (param0 != 1) {
          PlatformService var2 = (PlatformService) null;
          UiScrollPane.initializeArchiveSystem(56, (String) null, 29, -128, (byte) -61, -80, -20, (PlatformService) null, 10);
        }
    }

    UiScrollPane(int param0, int param1, int param2, int param3, UiRenderer param4, UiComponent param5, UiRenderer param6) {
        super(param0, param1, param2, param3, param4);
        UiViewport dupTemp$0 = null;
        try {
          this.children = new UiComponent[3];
          dupTemp$0 = new UiViewport(param0, param1, param2, param3, param6, param5);
          this.viewport = dupTemp$0;
          this.children[2] = (UiComponent) ((Object) dupTemp$0);
          this.layoutChildren(16777215);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "sha.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    private final void updateThumbSizes(byte param0) {
        int var3 = VoidHunters.field_G;
        int var2 = -85 % ((param0 + 47) / 56);
        if (this.verticalScrollbar == null) {
          if (null == this.horizontalScrollbar) {
            return;
          }
          if (this.viewport.width < this.viewport.child.width) {
            this.horizontalScrollbar.updateHorizontalThumbSize(this.viewport.width, 21944, this.viewport.child.width);
            return;
          }
          this.horizontalScrollbar.updateHorizontalThumbSize(1, 21944, 1);
          return;
        }
        if (this.viewport.height < this.viewport.child.height) {
          this.verticalScrollbar.updateVerticalThumbSize(this.viewport.height, this.viewport.child.height, 127);
          if (null == this.horizontalScrollbar) {
            return;
          }
          if (this.viewport.width < this.viewport.child.width) {
            this.horizontalScrollbar.updateHorizontalThumbSize(this.viewport.width, 21944, this.viewport.child.width);
            return;
          }
          this.horizontalScrollbar.updateHorizontalThumbSize(1, 21944, 1);
          return;
        }
        this.verticalScrollbar.updateVerticalThumbSize(1, 1, 127);
        if (null == this.horizontalScrollbar) {
          return;
        }
        if (this.viewport.width < this.viewport.child.width) {
          this.horizontalScrollbar.updateHorizontalThumbSize(this.viewport.width, 21944, this.viewport.child.width);
          return;
        }
        this.horizontalScrollbar.updateHorizontalThumbSize(1, 21944, 1);
    }

    final static void initializeArchiveSystem(int param0, String param1, int param2, int param3, byte param4, int param5, int param6, PlatformService param7, int param8) {
        GetFixedaim.field_o = param0;
        NormalMapTextureOperation.field_k = param7;
        TextHotspotRegion.field_l = param1;
        SetPointDefenceLaserProjectileDamage.field_p = param5;
        OpenGlToolkit.field_Ib = param8;
        ea.field_d = param6;
        if (param4 != -2) {
          return;
        }
        try {
          SetDefaultFiringLeeway.field_p = param2;
          GetLaserProjectiles.field_p = param3;
          GetAutozoomAmountMultiply.field_o = (NetworkArchiveClient) ((Object) new SocketNetworkArchiveClient());
          BlackBoxRecordingFactory.field_a = new ArchiveDiskWorker(param7);
          ArchiveIndexLoaderState.loader = new ArchiveIndexLoader(GetAutozoomAmountMultiply.field_o, BlackBoxRecordingFactory.field_a);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "sha.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ')');
        }
    }

    final void layoutChildren(int param0) {
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        UiScrollBar stackIn_15_0 = null;
        int stackIn_16_1 = 0;
        UiScrollBar stackIn_21_0;
        int stackIn_21_1;
        int stackIn_21_2;
        int stackIn_21_3;
        int stackIn_21_4;
        int stackIn_22_5;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        UiScrollBar stackIn_37_0 = null;
        int stackIn_38_1 = 0;
        UiScrollBar stackIn_43_0;
        int stackIn_43_1;
        int stackIn_43_2;
        int stackIn_43_3;
        int stackIn_43_4;
        int stackIn_44_5;
        int stackIn_50_0 = 0;
        int stackIn_53_0 = 0;
        UiScrollBar stackIn_57_0 = null;
        int stackIn_58_1 = 0;
        UiScrollBar stackIn_63_0;
        int stackIn_63_1;
        int stackIn_63_2;
        int stackIn_63_3;
        int stackIn_63_4;
        int stackIn_64_5;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        UiScrollBar stackIn_76_0 = null;
        int stackIn_77_1 = 0;
        UiScrollBar stackIn_82_0;
        int stackIn_82_1;
        int stackIn_82_2;
        int stackIn_82_3;
        int stackIn_82_4;
        int stackIn_83_5;
        int stackIn_88_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_96_0 = 0;
        UiScrollBar stackIn_100_0 = null;
        int stackIn_101_1 = 0;
        UiScrollBar stackIn_106_0;
        int stackIn_106_1;
        int stackIn_106_2;
        int stackIn_106_3;
        int stackIn_106_4;
        int stackIn_107_5;
        int stackIn_112_0 = 0;
        int stackIn_115_0 = 0;
        UiScrollBar stackIn_119_0 = null;
        int stackIn_120_1 = 0;
        UiScrollBar stackIn_125_0;
        int stackIn_125_1;
        int stackIn_125_2;
        int stackIn_125_3;
        int stackIn_125_4;
        int stackIn_126_5;
        int stackIn_134_0 = 0;
        int stackIn_137_0 = 0;
        UiScrollBar stackIn_141_0 = null;
        int stackIn_142_1 = 0;
        UiScrollBar stackIn_147_0;
        int stackIn_147_1;
        int stackIn_147_2;
        int stackIn_147_3;
        int stackIn_147_4;
        int stackIn_148_5;
        int stackIn_153_0 = 0;
        int stackIn_156_0 = 0;
        UiScrollBar stackIn_160_0 = null;
        int stackIn_161_1 = 0;
        UiScrollBar stackIn_166_0;
        int stackIn_166_1;
        int stackIn_166_2;
        int stackIn_166_3;
        int stackIn_166_4;
        int stackIn_167_5;
        int stackIn_174_0 = 0;
        int stackIn_177_0 = 0;
        UiScrollBar stackIn_181_0 = null;
        int stackIn_182_1 = 0;
        UiScrollBar stackIn_187_0;
        int stackIn_187_1;
        int stackIn_187_2;
        int stackIn_187_3;
        int stackIn_187_4;
        int stackIn_188_5;
        int stackIn_193_0 = 0;
        int stackIn_196_0 = 0;
        UiScrollBar stackIn_200_0 = null;
        int stackIn_201_1 = 0;
        UiScrollBar stackIn_206_0;
        int stackIn_206_1;
        int stackIn_206_2;
        int stackIn_206_3;
        int stackIn_206_4;
        int stackIn_207_5;
        int var2;
        int var3;
        int var4;
        int var5;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        if (this.verticalScrollbarOnRight) {
          stackIn_88_0 = 0;
        } else {
          if (null == this.verticalScrollbar) {
            var2 = 0;
            if (this.horizontalScrollbarOnBottom) {
              var3 = 0;
              if (param0 != 16777215) {
                this.viewport = (UiViewport) null;
              }
              if (null == this.verticalScrollbar) {
                stackIn_8_0 = this.width;
              } else {
                stackIn_8_0 = -this.verticalScrollbar.width + this.width;
              }
              var4 = stackIn_8_0;
              if (null != this.horizontalScrollbar) {
                stackIn_11_0 = this.height - this.horizontalScrollbar.height;
              } else {
                stackIn_11_0 = this.height;
              }
              var5 = stackIn_11_0;
              this.viewport.setBounds(var2, var4, var5, param0 ^ 16777214, var3);
              if (null != this.verticalScrollbar) {
                stackIn_15_0 = this.verticalScrollbar;
                if (!this.verticalScrollbarOnRight) {
                  stackIn_16_1 = 0;
                } else {
                  stackIn_16_1 = this.width - this.verticalScrollbar.width;
                }
                ((UiScrollBar) (Object) stackIn_15_0).setBounds(stackIn_16_1, this.verticalScrollbar.width, this.viewport.height, 1, this.viewport.y);
              }
              if (null != this.horizontalScrollbar) {
                stackIn_21_0 = this.horizontalScrollbar;
                stackIn_21_1 = this.viewport.x;
                stackIn_21_2 = this.viewport.width;
                stackIn_21_3 = this.horizontalScrollbar.height;
                stackIn_21_4 = 1;
                if (this.horizontalScrollbarOnBottom) {
                  stackIn_22_5 = -this.horizontalScrollbar.height + this.height;
                } else {
                  stackIn_22_5 = 0;
                }
                ((UiScrollBar) (Object) stackIn_21_0).setBounds(stackIn_21_1, stackIn_21_2, stackIn_21_3, stackIn_21_4, stackIn_22_5);
              }
              this.updateThumbSizes((byte) -109);
              return;
            }
            if (this.horizontalScrollbar == null) {
              var3Lifetime2 = 0;
              if (param0 != 16777215) {
                this.viewport = (UiViewport) null;
              }
              if (null == this.verticalScrollbar) {
                stackIn_30_0 = this.width;
              } else {
                stackIn_30_0 = -this.verticalScrollbar.width + this.width;
              }
              var4Lifetime2 = stackIn_30_0;
              if (null != this.horizontalScrollbar) {
                stackIn_33_0 = this.height - this.horizontalScrollbar.height;
              } else {
                stackIn_33_0 = this.height;
              }
              var5Lifetime2 = stackIn_33_0;
              this.viewport.setBounds(var2, var4Lifetime2, var5Lifetime2, param0 ^ 16777214, var3Lifetime2);
              if (null != this.verticalScrollbar) {
                stackIn_37_0 = this.verticalScrollbar;
                if (!this.verticalScrollbarOnRight) {
                  stackIn_38_1 = 0;
                } else {
                  stackIn_38_1 = this.width - this.verticalScrollbar.width;
                }
                ((UiScrollBar) (Object) stackIn_37_0).setBounds(stackIn_38_1, this.verticalScrollbar.width, this.viewport.height, 1, this.viewport.y);
              }
              if (null != this.horizontalScrollbar) {
                stackIn_43_0 = this.horizontalScrollbar;
                stackIn_43_1 = this.viewport.x;
                stackIn_43_2 = this.viewport.width;
                stackIn_43_3 = this.horizontalScrollbar.height;
                stackIn_43_4 = 1;
                if (this.horizontalScrollbarOnBottom) {
                  stackIn_44_5 = -this.horizontalScrollbar.height + this.height;
                } else {
                  stackIn_44_5 = 0;
                }
                ((UiScrollBar) (Object) stackIn_43_0).setBounds(stackIn_43_1, stackIn_43_2, stackIn_43_3, stackIn_43_4, stackIn_44_5);
              }
              this.updateThumbSizes((byte) -109);
              return;
            }
            var3Lifetime3 = this.horizontalScrollbar.height;
            if (param0 == 16777215) {
              if (null == this.verticalScrollbar) {
                stackIn_50_0 = this.width;
              } else {
                stackIn_50_0 = -this.verticalScrollbar.width + this.width;
              }
              var4Lifetime3 = stackIn_50_0;
              if (null != this.horizontalScrollbar) {
                stackIn_53_0 = this.height - this.horizontalScrollbar.height;
              } else {
                stackIn_53_0 = this.height;
              }
              var5Lifetime3 = stackIn_53_0;
              this.viewport.setBounds(var2, var4Lifetime3, var5Lifetime3, param0 ^ 16777214, var3Lifetime3);
              if (null != this.verticalScrollbar) {
                stackIn_57_0 = this.verticalScrollbar;
                if (!this.verticalScrollbarOnRight) {
                  stackIn_58_1 = 0;
                } else {
                  stackIn_58_1 = this.width - this.verticalScrollbar.width;
                }
                ((UiScrollBar) (Object) stackIn_57_0).setBounds(stackIn_58_1, this.verticalScrollbar.width, this.viewport.height, 1, this.viewport.y);
              }
              if (null != this.horizontalScrollbar) {
                stackIn_63_0 = this.horizontalScrollbar;
                stackIn_63_1 = this.viewport.x;
                stackIn_63_2 = this.viewport.width;
                stackIn_63_3 = this.horizontalScrollbar.height;
                stackIn_63_4 = 1;
                if (this.horizontalScrollbarOnBottom) {
                  stackIn_64_5 = -this.horizontalScrollbar.height + this.height;
                } else {
                  stackIn_64_5 = 0;
                }
                ((UiScrollBar) (Object) stackIn_63_0).setBounds(stackIn_63_1, stackIn_63_2, stackIn_63_3, stackIn_63_4, stackIn_64_5);
              }
              this.updateThumbSizes((byte) -109);
              return;
            }
            this.viewport = (UiViewport) null;
            if (null == this.verticalScrollbar) {
              stackIn_69_0 = this.width;
            } else {
              stackIn_69_0 = -this.verticalScrollbar.width + this.width;
            }
            var4Lifetime4 = stackIn_69_0;
            if (null != this.horizontalScrollbar) {
              stackIn_72_0 = this.height - this.horizontalScrollbar.height;
            } else {
              stackIn_72_0 = this.height;
            }
            var5Lifetime4 = stackIn_72_0;
            this.viewport.setBounds(var2, var4Lifetime4, var5Lifetime4, param0 ^ 16777214, var3Lifetime3);
            if (null != this.verticalScrollbar) {
              stackIn_76_0 = this.verticalScrollbar;
              if (!this.verticalScrollbarOnRight) {
                stackIn_77_1 = 0;
              } else {
                stackIn_77_1 = this.width - this.verticalScrollbar.width;
              }
              ((UiScrollBar) (Object) stackIn_76_0).setBounds(stackIn_77_1, this.verticalScrollbar.width, this.viewport.height, 1, this.viewport.y);
            }
            if (null != this.horizontalScrollbar) {
              stackIn_82_0 = this.horizontalScrollbar;
              stackIn_82_1 = this.viewport.x;
              stackIn_82_2 = this.viewport.width;
              stackIn_82_3 = this.horizontalScrollbar.height;
              stackIn_82_4 = 1;
              if (this.horizontalScrollbarOnBottom) {
                stackIn_83_5 = -this.horizontalScrollbar.height + this.height;
              } else {
                stackIn_83_5 = 0;
              }
              ((UiScrollBar) (Object) stackIn_82_0).setBounds(stackIn_82_1, stackIn_82_2, stackIn_82_3, stackIn_82_4, stackIn_83_5);
            }
            this.updateThumbSizes((byte) -109);
            return;
          }
          stackIn_88_0 = this.verticalScrollbar.width;
        }
        var2Lifetime1 = stackIn_88_0;
        if (this.horizontalScrollbarOnBottom) {
          var3Lifetime1 = 0;
          if (param0 == 16777215) {
            if (null == this.verticalScrollbar) {
              stackIn_93_0 = this.width;
            } else {
              stackIn_93_0 = -this.verticalScrollbar.width + this.width;
            }
            var4Lifetime1 = stackIn_93_0;
            if (null != this.horizontalScrollbar) {
              stackIn_96_0 = this.height - this.horizontalScrollbar.height;
            } else {
              stackIn_96_0 = this.height;
            }
            var5Lifetime1 = stackIn_96_0;
            this.viewport.setBounds(var2Lifetime1, var4Lifetime1, var5Lifetime1, param0 ^ 16777214, var3Lifetime1);
            if (null != this.verticalScrollbar) {
              stackIn_100_0 = this.verticalScrollbar;
              if (!this.verticalScrollbarOnRight) {
                stackIn_101_1 = 0;
              } else {
                stackIn_101_1 = this.width - this.verticalScrollbar.width;
              }
              ((UiScrollBar) (Object) stackIn_100_0).setBounds(stackIn_101_1, this.verticalScrollbar.width, this.viewport.height, 1, this.viewport.y);
            }
            if (null != this.horizontalScrollbar) {
              stackIn_106_0 = this.horizontalScrollbar;
              stackIn_106_1 = this.viewport.x;
              stackIn_106_2 = this.viewport.width;
              stackIn_106_3 = this.horizontalScrollbar.height;
              stackIn_106_4 = 1;
              if (this.horizontalScrollbarOnBottom) {
                stackIn_107_5 = -this.horizontalScrollbar.height + this.height;
              } else {
                stackIn_107_5 = 0;
              }
              ((UiScrollBar) (Object) stackIn_106_0).setBounds(stackIn_106_1, stackIn_106_2, stackIn_106_3, stackIn_106_4, stackIn_107_5);
            }
          } else {
            this.viewport = (UiViewport) null;
            if (null == this.verticalScrollbar) {
              stackIn_112_0 = this.width;
            } else {
              stackIn_112_0 = -this.verticalScrollbar.width + this.width;
            }
            var4Lifetime1 = stackIn_112_0;
            if (null != this.horizontalScrollbar) {
              stackIn_115_0 = this.height - this.horizontalScrollbar.height;
            } else {
              stackIn_115_0 = this.height;
            }
            var5Lifetime1 = stackIn_115_0;
            this.viewport.setBounds(var2Lifetime1, var4Lifetime1, var5Lifetime1, param0 ^ 16777214, var3Lifetime1);
            if (null != this.verticalScrollbar) {
              stackIn_119_0 = this.verticalScrollbar;
              if (!this.verticalScrollbarOnRight) {
                stackIn_120_1 = 0;
              } else {
                stackIn_120_1 = this.width - this.verticalScrollbar.width;
              }
              ((UiScrollBar) (Object) stackIn_119_0).setBounds(stackIn_120_1, this.verticalScrollbar.width, this.viewport.height, 1, this.viewport.y);
            }
            if (null != this.horizontalScrollbar) {
              stackIn_125_0 = this.horizontalScrollbar;
              stackIn_125_1 = this.viewport.x;
              stackIn_125_2 = this.viewport.width;
              stackIn_125_3 = this.horizontalScrollbar.height;
              stackIn_125_4 = 1;
              if (this.horizontalScrollbarOnBottom) {
                stackIn_126_5 = -this.horizontalScrollbar.height + this.height;
              } else {
                stackIn_126_5 = 0;
              }
              ((UiScrollBar) (Object) stackIn_125_0).setBounds(stackIn_125_1, stackIn_125_2, stackIn_125_3, stackIn_125_4, stackIn_126_5);
            }
          }
        } else {
          if (this.horizontalScrollbar != null) {
            var3Lifetime1 = this.horizontalScrollbar.height;
            if (param0 == 16777215) {
              if (null == this.verticalScrollbar) {
                stackIn_174_0 = this.width;
              } else {
                stackIn_174_0 = -this.verticalScrollbar.width + this.width;
              }
              var4Lifetime1 = stackIn_174_0;
              if (null != this.horizontalScrollbar) {
                stackIn_177_0 = this.height - this.horizontalScrollbar.height;
              } else {
                stackIn_177_0 = this.height;
              }
              var5Lifetime1 = stackIn_177_0;
              this.viewport.setBounds(var2Lifetime1, var4Lifetime1, var5Lifetime1, param0 ^ 16777214, var3Lifetime1);
              if (null != this.verticalScrollbar) {
                stackIn_181_0 = this.verticalScrollbar;
                if (!this.verticalScrollbarOnRight) {
                  stackIn_182_1 = 0;
                } else {
                  stackIn_182_1 = this.width - this.verticalScrollbar.width;
                }
                ((UiScrollBar) (Object) stackIn_181_0).setBounds(stackIn_182_1, this.verticalScrollbar.width, this.viewport.height, 1, this.viewport.y);
              }
              if (null != this.horizontalScrollbar) {
                stackIn_187_0 = this.horizontalScrollbar;
                stackIn_187_1 = this.viewport.x;
                stackIn_187_2 = this.viewport.width;
                stackIn_187_3 = this.horizontalScrollbar.height;
                stackIn_187_4 = 1;
                if (this.horizontalScrollbarOnBottom) {
                  stackIn_188_5 = -this.horizontalScrollbar.height + this.height;
                } else {
                  stackIn_188_5 = 0;
                }
                ((UiScrollBar) (Object) stackIn_187_0).setBounds(stackIn_187_1, stackIn_187_2, stackIn_187_3, stackIn_187_4, stackIn_188_5);
              }
            } else {
              this.viewport = (UiViewport) null;
              if (null == this.verticalScrollbar) {
                stackIn_193_0 = this.width;
              } else {
                stackIn_193_0 = -this.verticalScrollbar.width + this.width;
              }
              var4Lifetime1 = stackIn_193_0;
              if (null != this.horizontalScrollbar) {
                stackIn_196_0 = this.height - this.horizontalScrollbar.height;
              } else {
                stackIn_196_0 = this.height;
              }
              var5Lifetime1 = stackIn_196_0;
              this.viewport.setBounds(var2Lifetime1, var4Lifetime1, var5Lifetime1, param0 ^ 16777214, var3Lifetime1);
              if (null != this.verticalScrollbar) {
                stackIn_200_0 = this.verticalScrollbar;
                if (!this.verticalScrollbarOnRight) {
                  stackIn_201_1 = 0;
                } else {
                  stackIn_201_1 = this.width - this.verticalScrollbar.width;
                }
                ((UiScrollBar) (Object) stackIn_200_0).setBounds(stackIn_201_1, this.verticalScrollbar.width, this.viewport.height, 1, this.viewport.y);
              }
              if (null != this.horizontalScrollbar) {
                stackIn_206_0 = this.horizontalScrollbar;
                stackIn_206_1 = this.viewport.x;
                stackIn_206_2 = this.viewport.width;
                stackIn_206_3 = this.horizontalScrollbar.height;
                stackIn_206_4 = 1;
                if (this.horizontalScrollbarOnBottom) {
                  stackIn_207_5 = -this.horizontalScrollbar.height + this.height;
                } else {
                  stackIn_207_5 = 0;
                }
                ((UiScrollBar) (Object) stackIn_206_0).setBounds(stackIn_206_1, stackIn_206_2, stackIn_206_3, stackIn_206_4, stackIn_207_5);
              }
            }
          } else {
            var3Lifetime1 = 0;
            if (param0 == 16777215) {
              if (null == this.verticalScrollbar) {
                stackIn_134_0 = this.width;
              } else {
                stackIn_134_0 = -this.verticalScrollbar.width + this.width;
              }
              var4Lifetime1 = stackIn_134_0;
              if (null != this.horizontalScrollbar) {
                stackIn_137_0 = this.height - this.horizontalScrollbar.height;
              } else {
                stackIn_137_0 = this.height;
              }
              var5Lifetime1 = stackIn_137_0;
              this.viewport.setBounds(var2Lifetime1, var4Lifetime1, var5Lifetime1, param0 ^ 16777214, var3Lifetime1);
              if (null != this.verticalScrollbar) {
                stackIn_141_0 = this.verticalScrollbar;
                if (!this.verticalScrollbarOnRight) {
                  stackIn_142_1 = 0;
                } else {
                  stackIn_142_1 = this.width - this.verticalScrollbar.width;
                }
                ((UiScrollBar) (Object) stackIn_141_0).setBounds(stackIn_142_1, this.verticalScrollbar.width, this.viewport.height, 1, this.viewport.y);
              }
              if (null != this.horizontalScrollbar) {
                stackIn_147_0 = this.horizontalScrollbar;
                stackIn_147_1 = this.viewport.x;
                stackIn_147_2 = this.viewport.width;
                stackIn_147_3 = this.horizontalScrollbar.height;
                stackIn_147_4 = 1;
                if (this.horizontalScrollbarOnBottom) {
                  stackIn_148_5 = -this.horizontalScrollbar.height + this.height;
                } else {
                  stackIn_148_5 = 0;
                }
                ((UiScrollBar) (Object) stackIn_147_0).setBounds(stackIn_147_1, stackIn_147_2, stackIn_147_3, stackIn_147_4, stackIn_148_5);
              }
            } else {
              this.viewport = (UiViewport) null;
              if (null == this.verticalScrollbar) {
                stackIn_153_0 = this.width;
              } else {
                stackIn_153_0 = -this.verticalScrollbar.width + this.width;
              }
              var4Lifetime1 = stackIn_153_0;
              if (null != this.horizontalScrollbar) {
                stackIn_156_0 = this.height - this.horizontalScrollbar.height;
              } else {
                stackIn_156_0 = this.height;
              }
              var5Lifetime1 = stackIn_156_0;
              this.viewport.setBounds(var2Lifetime1, var4Lifetime1, var5Lifetime1, param0 ^ 16777214, var3Lifetime1);
              if (null != this.verticalScrollbar) {
                stackIn_160_0 = this.verticalScrollbar;
                if (!this.verticalScrollbarOnRight) {
                  stackIn_161_1 = 0;
                } else {
                  stackIn_161_1 = this.width - this.verticalScrollbar.width;
                }
                ((UiScrollBar) (Object) stackIn_160_0).setBounds(stackIn_161_1, this.verticalScrollbar.width, this.viewport.height, 1, this.viewport.y);
              }
              if (null != this.horizontalScrollbar) {
                stackIn_166_0 = this.horizontalScrollbar;
                stackIn_166_1 = this.viewport.x;
                stackIn_166_2 = this.viewport.width;
                stackIn_166_3 = this.horizontalScrollbar.height;
                stackIn_166_4 = 1;
                if (this.horizontalScrollbarOnBottom) {
                  stackIn_167_5 = -this.horizontalScrollbar.height + this.height;
                } else {
                  stackIn_167_5 = 0;
                }
                ((UiScrollBar) (Object) stackIn_166_0).setBounds(stackIn_166_1, stackIn_166_2, stackIn_166_3, stackIn_166_4, stackIn_167_5);
              }
            }
          }
        }
        this.updateThumbSizes((byte) -109);
    }

    private final boolean scrollVertically(int param0, int param1) {
        if (this.verticalScrollbar != null) {
          this.verticalScrollbar.setVerticalPosition(param1 + 1715701295, this.verticalScrollbar.verticalLineStep * param0 + this.verticalScrollbar.verticalPosition);
          return true;
        }
        if (param1 == -1715704688) {
          return false;
        }
        this.applyScrollOffsets(-30);
        return false;
    }

    final boolean handleKey(int param0, int param1, UiComponent param2, char param3) {
        RuntimeException var5 = null;
        UiComponent var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -15834) {
            var6 = (UiComponent) null;
            this.handleKey(-106, -5, (UiComponent) null, '￘');
          }
          if (!super.handleKey(param0 + 0, param1, param2, param3)) {
            return false;
          }
          this.applyScrollOffsets(-1715704688);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("sha.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        try {
          super.updatePointer(param0, param1, param2 ^ 0, param3);
          if (param2 != -981) {
            UiComponent var6 = (UiComponent) null;
            this.updatePointer(23, 55, 77, (UiComponent) null);
          }
          this.updateThumbSizes((byte) -113);
          this.applyScrollOffsets(-1715704688);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "sha.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void applyScrollOffsets(int param0) {
        if (null != this.verticalScrollbar) {
          this.viewport.child.y = -(int)((long)(this.viewport.child.height - this.viewport.height) * (long)this.verticalScrollbar.verticalPosition >> 16);
        }
        if (param0 != -1715704688) {
          PlatformService var3 = (PlatformService) null;
          UiScrollPane.initializeArchiveSystem(74, (String) null, -117, -2, (byte) 104, -89, -50, (PlatformService) null, -99);
          if (null != this.horizontalScrollbar) {
            this.viewport.child.x = -(int)((long)(this.viewport.child.width - this.viewport.width) * (long)this.horizontalScrollbar.horizontalPosition >> 16);
            return;
          }
          return;
        }
        if (null == this.horizontalScrollbar) {
          return;
        }
        this.viewport.child.x = -(int)((long)(this.viewport.child.width - this.viewport.width) * (long)this.horizontalScrollbar.horizontalPosition >> 16);
    }

    final boolean handleMouseWheel(int param0, int param1, int param2, UiComponent param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleMouseWheel(param0, param1, param2, param3, param4, param5, param6)) {
            return true;
          }
          stackIn_8_0 = (this.hasFocus((byte) -120)) && (this.scrollVertically(param2, param1 - 1715698682));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("sha.WA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_x = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
