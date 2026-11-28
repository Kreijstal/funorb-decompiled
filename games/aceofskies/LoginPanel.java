/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginPanel extends DequeWidgetContainer implements TextFieldListener, WidgetActivationListener {
    static pt field_t;
    private EditableTextField field_x;
    private boolean field_B;
    private InteractiveWidget field_D;
    static int field_u;
    private InteractiveWidget field_z;
    private boolean field_C;
    private EditableTextField field_v;
    private InteractiveWidget field_w;
    private String field_y;
    private boolean field_E;
    static int field_A;

    final void drawWidget(byte param0, int param1, int param2, int param3) {
        if (this.field_y != null) {
          qo.field_b.drawParagraph(this.field_y, 20 + param3 + this.field_p, 15 + param2 + this.field_h, this.field_q - 40, this.field_n, 16777215, -1, 1, 0, qo.field_b.maxAscent);
        }
        if (null != this.field_w) {
          SoftwareRasterizer.drawHorizontalLine(param3 + 10, param2 + 134, -20 + this.field_q, 4210752);
        }
        if (param0 <= 64) {
          return;
        }
        super.drawWidget((byte) 77, param1, param2, param3);
    }

    final static float a(float param0, int param1) {
        if (param1 > -55) {
          field_u = -54;
        }
        return param0 * (param0 * param0) * (param0 * (-15.0f + param0 * 6.0f) + 10.0f);
    }

    final boolean handleKey(int param0, int param1, char param2, UiWidget param3) {
        String stackIn_16_2 = null;
        try {
          if (super.handleKey(-20, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            boolean stackIn_6_0 = this.focusPreviousChild(param3, -101);
            return stackIn_6_0;
          }
          if (param1 == 99) {
            boolean stackIn_10_0 = this.focusNextChild(80, param3);
            return stackIn_10_0;
          }
          int var5_int = -87 % ((param0 + 53) / 33);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var5;
          StringBuilder stackIn_15_1 = new StringBuilder().append("ce.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void setAccountAndClearPassword(String param0, int param1) {
        try {
          EditableTextField var3 = this.field_v;
          String var4 = param0;
          var3.setText(-20975, var4, false);
          if (param1 < 43) {
            EditableTextField var5 = (EditableTextField) null;
            this.onTextSubmitted((EditableTextField) null, 39);
          }
          this.field_x.clearText((byte) -2);
        } catch (RuntimeException runtimeException) {
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) runtimeException), "ce.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void clearCredentials(int param0) {
        this.field_v.clearText((byte) -2);
        this.field_x.clearText((byte) -2);
        if (param0 != 310) {
          this.field_x = (EditableTextField) null;
        }
    }

    final String getAccountIdentifier(boolean param0) {
        if (param0) {
          return (String) null;
        }
        if (null == this.field_v.field_f) {
          return "";
        }
        return this.field_v.field_f;
    }

    final static void decodeHighscoreResponse(byte obfuscationGuard) {
        int obfuscationControl = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 116) {
            field_A = -61;
          }
          CipherPacketBuffer packet = IntKeyLookup.incomingPacket;
          int responseKind = packet.readUnsignedByte(-85);
          if (responseKind == 0) {
            int queryId = packet.readUnsignedShort((byte) 0);
            HighscoreQuery query = (HighscoreQuery) (nh.pendingHighscoreQueries.first(268435455));
            while (query != null) {
              if (queryId != query.queryId) {
                query = (HighscoreQuery) (nh.pendingHighscoreQueries.next((byte) 103));
                continue;
              }
              break;
            }
            if (query == null) {
              te.b(true);
              return;
            }
            int nameEntryCount = packet.readUnsignedByte(obfuscationGuard - 167);
            if (nameEntryCount != 0) {
              int entryLimit = query.entryLimit;
              NodeHashTableIterator.highscoreNameEntries[0].alternateName = null;
              int valuesPerEntry = query.valuesPerEntry;
              NodeHashTableIterator.highscoreNameEntries[0].primaryName = fj.playerDisplayName;
              NodeHashTableIterator.highscoreNameEntries[0].usedInUniqueView = false;
              for (int nameEntryIndex = 1; nameEntryIndex < nameEntryCount; nameEntryIndex++) {
                NodeHashTableIterator.highscoreNameEntries[nameEntryIndex].primaryName = packet.readNullTerminatedText(-17883);
                NodeHashTableIterator.highscoreNameEntries[nameEntryIndex].usedInUniqueView = false;
                if (packet.readUnsignedByte(-47) != 1) {
                  NodeHashTableIterator.highscoreNameEntries[nameEntryIndex].alternateName = null;
                } else {
                  NodeHashTableIterator.highscoreNameEntries[nameEntryIndex].alternateName = packet.readNullTerminatedText(obfuscationGuard ^ -17839);
                }
              }
              String[][] dupTemp$0 = new String[3][entryLimit];
              query.namesByView = dupTemp$0;
              String[][] namesByView = dupTemp$0;
              String[][] alternateNamesByView = new String[3][entryLimit];
              long[][] dupTemp$1 = new long[3][entryLimit];
              query.submissionTokensByView = dupTemp$1;
              long[][] submissionTokensByView = dupTemp$1;
              int[][] dupTemp$2 = new int[3][entryLimit * valuesPerEntry];
              query.valuesByView = dupTemp$2;
              int[][] valuesByView = dupTemp$2;
              int allRowCount = 0;
              int ownRowCount = 0;
              int uniqueRowCount = 0;
              int allValueOffset = 0;
              int ownValueOffset = 0;
              int uniqueValueOffset = 0;
              int rowCount = packet.readUnsignedByte(-119);
              if (rowCount > 0) {
                for (int rowIndex = 0; rowIndex < rowCount; rowIndex++) {
                  int nameIndex = packet.readUnsignedByte(obfuscationGuard ^ 69);
                  String displayName = NodeHashTableIterator.highscoreNameEntries[nameIndex].primaryName;
                  long submissionToken = packet.readLong((byte) -32);
                  int valuesStartPosition = packet.position;
                  if (entryLimit > rowIndex) {
                    namesByView[0][allRowCount] = displayName;
                    alternateNamesByView[0][allRowCount] = NodeHashTableIterator.highscoreNameEntries[nameIndex].alternateName;
                    submissionTokensByView[0][allRowCount] = submissionToken;
                    allRowCount++;
                    for (int allValueIndex = 0; valuesPerEntry > allValueIndex; allValueIndex++) {
                      int incrementValue$3 = allValueOffset;
                      allValueOffset++;
                      valuesByView[0][incrementValue$3] = packet.readInt((byte) 124);
                    }
                  }
                  if (displayName != null &&
                    fd.isCurrentPlayerName(displayName, (byte) -6)) {
                    namesByView[1][ownRowCount] = fj.playerDisplayName;
                    alternateNamesByView[1][ownRowCount] = null;
                    submissionTokensByView[1][ownRowCount] = submissionToken;
                    ownRowCount++;
                    packet.position = valuesStartPosition;
                    for (int ownValueIndex = 0; valuesPerEntry > ownValueIndex; ownValueIndex++) {
                      int incrementValue$4 = ownValueOffset;
                      ownValueOffset++;
                      valuesByView[1][incrementValue$4] = packet.readInt((byte) 114);
                    }
                  }
                  if (entryLimit > uniqueRowCount &&
                    !NodeHashTableIterator.highscoreNameEntries[nameIndex].usedInUniqueView) {
                    NodeHashTableIterator.highscoreNameEntries[nameIndex].usedInUniqueView = true;
                    namesByView[2][uniqueRowCount] = displayName;
                    alternateNamesByView[2][uniqueRowCount] = NodeHashTableIterator.highscoreNameEntries[nameIndex].alternateName;
                    submissionTokensByView[2][uniqueRowCount] = submissionToken;
                    uniqueRowCount++;
                    packet.position = valuesStartPosition;
                    for (int uniqueValueIndex = 0; valuesPerEntry > uniqueValueIndex; uniqueValueIndex++) {
                      int incrementValue$5 = uniqueValueOffset;
                      uniqueValueOffset++;
                      valuesByView[2][incrementValue$5] = packet.readInt((byte) 113);
                    }
                  }
                }
              }
            }
            query.completed = true;
            query.unlink(obfuscationGuard ^ -16);
            return;
          }
          if (responseKind == 1) {
            int submissionId = packet.readUnsignedShort((byte) 0);
            long acknowledgementToken = packet.readLong((byte) 64);
            ScoreSubmission submission = (ScoreSubmission) (tq.pendingScoreSubmissions.first(268435455));
            while (submission != null) {
              if (submission.submissionId != submissionId) {
                submission = (ScoreSubmission) (tq.pendingScoreSubmissions.next((byte) 103));
                continue;
              }
              break;
            }
            if (submission == null) {
              te.b(true);
              return;
            }
            submission.submissionToken = acknowledgementToken;
            submission.unlink(-127);
            return;
          }
          v.a("HS1: " + CipherPacketBuffer.k((byte) 65), (byte) -52, (Throwable) null);
          te.b(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) var1), "ce.JA(" + obfuscationGuard + ')');
        }
    }

    public final void onTextSubmitted(EditableTextField param0, int param1) {
        String stackIn_11_2 = null;
        try {
          if (param0 == this.field_v) {
            this.field_x.takeFocus((UiWidget) (this), (byte) -42);
          }
          if (this.field_x == param0) {
            this.submitLogin((byte) -85);
          }
          if (param1 != -40) {
            this.field_D = (InteractiveWidget) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var3;
          StringBuilder stackIn_10_1 = new StringBuilder().append("ce.V(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean g(int param0) {
        if (param0 != -3) {
          return false;
        }
        return SpriteState.field_s;
    }

    private final void submitLogin(byte param0) {
        if (PasswordValidator.e(31574) ||
          !(this.field_v.field_f.length() <= 0) &&
          !(0 >= this.field_x.field_f.length())) {
          s.a(this.field_x.field_f, false, this.field_v.field_f);
        }
        if (param0 > -59) {
          this.submitLogin((byte) -4);
        }
    }

    public final void onWidgetActivated(int param0, InteractiveWidget param1, int param2, int param3, byte param4) {
        String stackIn_17_2 = null;
        int var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param1 == this.field_D) {
            this.submitLogin((byte) -84);
          } else if (param1 != this.field_w) {
            if (this.field_z != param1) {
              int var6_int = 122 % ((param4 + 27) / 61);
              return;
            }
            if (this.field_C) {
              ArchiveIndex.b(17);
            } else if (this.field_E) {
              RasterBuffer.b((byte) -75);
            } else {
              PacketBuffer.i(-112);
            }
          } else {
            OpenGlRenderbuffer.c((byte) 104);
          }
          int var6_intLifetime1 = 122 % ((param4 + 27) / 61);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var6;
          StringBuilder stackIn_16_1 = new StringBuilder().append("ce.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void onTextChanged(EditableTextField param0, int param1) {
        try {
          if (param1 != -6525) {
            String var4 = (String) null;
            this.setAccountAndClearPassword((String) null, 56);
          }
        } catch (RuntimeException runtimeException) {
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) runtimeException), "ce.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    LoginPanel(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (WidgetRenderer) null);
        String stackIn_19_3 = null;
        String stackIn_60_2 = null;
        String stackIn_63_2 = null;
        try {
          boolean stackIn_4_1 = (param4);
          this.field_E = stackIn_4_1;
          this.field_y = param1;
          boolean stackIn_7_1 = (param3);
          this.field_B = stackIn_7_1;
          boolean stackIn_10_1 = (param2);
          this.field_C = stackIn_10_1;
          if (this.field_C && (this.field_B ||
            this.field_E)) {
            throw new IllegalStateException();
          }
          this.field_v = (EditableTextField) ((Object) new ValidatedTextField(param0, (WidgetEventListener) (this), 100));
          this.field_x = (EditableTextField) ((Object) new ValidatedTextField("", (WidgetEventListener) (this), 20));
          if (!this.field_C) {
            this.field_D = new InteractiveWidget(ms.field_a, (WidgetEventListener) null);
            InteractiveWidget stackIn_18_1 = null;
            InteractiveWidget stackIn_18_2 = null;
            if (!this.field_E) {
              stackIn_19_3 = Bullet.field_j;
            } else {
              InteractiveWidget stackIn_19_1 = null;
              InteractiveWidget stackIn_19_2 = null;
              stackIn_19_3 = nu.field_a;
            }
            this.field_z = new InteractiveWidget(stackIn_19_3, (WidgetEventListener) null);
            if (this.field_B) {
              this.field_w = new InteractiveWidget(SteeringMode.field_b, (WidgetEventListener) (this));
            }
          } else {
            this.field_D = new InteractiveWidget(DraggableWidgetContainer.field_z, (WidgetEventListener) null);
            this.field_z = new InteractiveWidget(SoftCacheReference.field_s, (WidgetEventListener) null);
            this.field_v.field_u = false;
          }
          this.field_v.field_e = (WidgetRenderer) ((Object) new sl(10000536));
          this.field_x.field_e = (WidgetRenderer) ((Object) new ul(10000536));
          qb var6 = new qb();
          this.field_D.field_e = (WidgetRenderer) ((Object) var6);
          if (null != this.field_z) {
            this.field_z.field_e = (WidgetRenderer) ((Object) var6);
          }
          this.field_v.field_k = ae.field_g;
          if (null != this.field_w) {
            this.field_w.field_e = (WidgetRenderer) ((Object) var6);
          }
          if (this.field_w != null) {
            this.field_w.field_k = cl.field_db;
          }
          if (this.field_C) {
            this.field_z.field_k = WeightedObjectCache.field_d;
          } else if (this.field_E) {
            this.field_z.field_k = td.field_c;
            this.field_z.field_e = (WidgetRenderer) ((Object) new wg());
          } else {
            this.field_z.field_e = (WidgetRenderer) ((Object) new wg());
          }
          this.field_h = 15;
          BitmapFont var7 = qo.field_b;
          if (null != this.field_y) {
            this.field_h = this.field_h + (5 + var7.measureWrappedHeight(this.field_y, this.field_q - 40, var7.maxAscent));
          }
          String var8 = ValidatedTextField.field_J;
          gu var9 = IterableNodeHashTable.a(17123, EditableTextField.m(125));
          if (ef.field_k == var9) {
            var8 = hu.field_b;
          } else if (lp.field_f == var9) {
            var8 = OpenGlShaderProgram.field_e;
          }
          LabeledWidgetContainer dupTemp$0 = new LabeledWidgetContainer(10, this.field_h, -20 + this.field_q, 25, this.field_v, false, 80, 3, var7, 16777215, var8);
          LabeledWidgetContainer var12 = dupTemp$0;
          this.addChild(dupTemp$0, 1);
          this.field_h = this.field_h + (((UiWidget) ((Object) var12)).field_n + 5);
          LabeledWidgetContainer dupTemp$1 = new LabeledWidgetContainer(10, this.field_h, -20 + this.field_q, 25, this.field_x, false, 80, 3, var7, 16777215, OpenGlShaderObject.field_b);
          LabeledWidgetContainer var13 = dupTemp$1;
          this.addChild(dupTemp$1, 1);
          this.field_D.field_o = (WidgetEventListener) (this);
          this.field_h = this.field_h + (5 + ((UiWidget) ((Object) var13)).field_n);
          if (null != this.field_w) {
            this.field_w.field_o = (WidgetEventListener) (this);
          }
          if (null != this.field_z) {
            this.field_z.field_o = (WidgetEventListener) (this);
          }
          if (this.field_w != null) {
            this.field_D.setBounds(30, 85, this.field_h, -95 + this.field_q, (byte) 126);
            this.field_h = this.field_h + 60;
          } else {
            this.field_D.setBounds(30, 8, this.field_h, -6 + (this.field_q - 10), (byte) 126);
            this.field_h = this.field_h + 35;
          }
          if (null != this.field_w) {
            this.field_w.setBounds(30, 8, this.field_h, this.field_q - 6 - 10, (byte) 126);
            this.field_h = this.field_h + 35;
          }
          if (this.field_z != null) {
            if (!this.field_C &&
              !this.field_E) {
              this.field_z.setBounds(20, 8, this.field_h, 40, (byte) 126);
              this.field_h = this.field_h + 25;
            } else {
              this.field_z.setBounds(30, 8, this.field_h, this.field_q - 6 - 10, (byte) 127);
              this.field_h = this.field_h + 35;
            }
          }
          this.setBounds(this.field_h + 3, 0, 0, this.field_q, (byte) 126);
          this.addChild(this.field_D, 1);
          if (this.field_w != null) {
            this.addChild(this.field_w, 1);
          }
          if (null != this.field_z) {
            this.addChild(this.field_z, 1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6_ref = decompiledCaughtException;
          RuntimeException stackIn_59_0 = var6_ref;
          StringBuilder stackIn_59_1 = new StringBuilder().append("ce.<init>(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          StringBuilder stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static Sprite[] b(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != -29003) {
          field_t = (pt) null;
        }
        return qk.a(3, 1, param3, param4, 1, 1, param1, -128, param0);
    }

    public static void clearStaticReferences(int param0) {
        field_t = null;
        int var1 = -76 / ((param0 - 35) / 61);
    }

    static {
        field_t = new pt();
    }
}
