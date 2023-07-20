Public Class Form1
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        'Declare Variables
        Dim strInput As String
        Dim intCount As Integer

        'Get Input from User
        strInput = InputBox("Please enter a sentence:", "The Power of Words")

        'Check for Empty String
        If strInput <> "" Then

            'Loop through Input
            For intCount = 1 To Len(strInput) Step 1

                'Display Result
                lstResult.Items.Add(Mid(strInput, intCount, 1))

            Next

        Else

            'Display Error
            MessageBox.Show("Input is empty", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error)

        End If
    End Sub
End Class